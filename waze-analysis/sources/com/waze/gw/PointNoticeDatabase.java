package com.waze.gw;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes10.dex */
final class PointNoticeDatabase {
    static final int SUPPORTED_SCHEMA = 2;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final int[] bucketLengths;
    private final int[] bucketOffsets;
    final byte[] bytes;
    final String datasetVersion;
    final long generatedAtMs;
    final int spatialZoom;
    private final long[] tileKeys;

    private PointNoticeDatabase(byte[] bArr, String str, long j2, int i2, List<IndexEntry> list) {
        this.bytes = bArr;
        this.datasetVersion = str;
        this.generatedAtMs = j2;
        this.spatialZoom = i2;
        Collections.sort(list, new Comparator<IndexEntry>() { // from class: com.waze.gw.PointNoticeDatabase.1
            @Override // java.util.Comparator
            public int compare(IndexEntry indexEntry, IndexEntry indexEntry2) {
                if (indexEntry.key < indexEntry2.key) {
                    return -1;
                }
                return indexEntry.key == indexEntry2.key ? 0 : 1;
            }
        });
        this.tileKeys = new long[list.size()];
        this.bucketOffsets = new int[list.size()];
        this.bucketLengths = new int[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            IndexEntry indexEntry = list.get(i3);
            if (i3 > 0 && indexEntry.key == this.tileKeys[i3 - 1]) {
                throw new ParseException("duplicate point-notice tile");
            }
            this.tileKeys[i3] = indexEntry.key;
            this.bucketOffsets[i3] = indexEntry.offset;
            this.bucketLengths[i3] = indexEntry.length;
        }
    }

    static PointNoticeDatabase parse(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new ParseException("empty database");
        }
        int i2 = 0;
        Reader reader = new Reader(bArr, 0, bArr.length);
        ArrayList arrayList = new ArrayList();
        String string = "";
        long varint = 0;
        int i3 = 0;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i4 = tag >>> 3;
            int i5 = tag & 7;
            if (i4 == 1 && i5 == 0) {
                i2 = reader.readInt();
            } else if (i4 == 2 && i5 == 2) {
                string = reader.readString();
            } else if (i4 == 3 && i5 == 0) {
                varint = reader.readVarint();
            } else if (i4 == 4 && i5 == 0) {
                i3 = reader.readInt();
            } else if (i4 == 5 && i5 == 2) {
                int length = reader.readLength();
                int iPosition = reader.position();
                arrayList.add(new IndexEntry(scanBucketKey(bArr, iPosition, length), iPosition, length));
                reader.skipBytes(length);
            } else {
                reader.skipField(i5);
            }
        }
        if (i2 != 2) {
            throw new ParseException("unsupported schema " + i2);
        }
        if (string.length() == 0 || varint <= 0 || i3 < 1 || i3 > 22) {
            throw new ParseException("missing point database metadata");
        }
        return new PointNoticeDatabase(bArr, string, varint, i3, arrayList);
    }

    List<Notice> nearby(double d2, double d3) {
        int iTileX = tileX(d3, this.spatialZoom);
        int iTileY = tileY(d2, this.spatialZoom);
        ArrayList arrayList = new ArrayList();
        for (int i2 = -1; i2 <= 1; i2++) {
            for (int i3 = -1; i3 <= 1; i3++) {
                int iFind = find(tileKey(iTileX + i3, iTileY + i2));
                if (iFind >= 0) {
                    parseBucket(this.bucketOffsets[iFind], this.bucketLengths[iFind], arrayList);
                }
            }
        }
        return arrayList;
    }

    private int find(long j2) {
        int length = this.tileKeys.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = this.tileKeys[i3];
            if (j3 < j2) {
                i2 = i3 + 1;
            } else {
                if (j3 <= j2) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -1;
    }

    private void parseBucket(int i2, int i3, List<Notice> list) {
        Reader reader = new Reader(this.bytes, i2, i3);
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i4 = tag >>> 3;
            int i5 = tag & 7;
            if (i4 == 3 && i5 == 2) {
                int length = reader.readLength();
                list.add(parseNotice(reader.child(length)));
                reader.skipBytes(length);
            } else {
                reader.skipField(i5);
            }
        }
    }

    private static Notice parseNotice(Reader reader) {
        Notice notice = new Notice();
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i2 = tag >>> 3;
            int i3 = tag & 7;
            if (i2 == 1 && i3 == 2) {
                notice.id = reader.readString();
            } else if (i2 == 2 && i3 == 0) {
                notice.type = reader.readInt();
            } else if (i2 == 3 && i3 == 0) {
                notice.longitudeE6 = reader.readSint32();
            } else if (i2 == 4 && i3 == 0) {
                notice.latitudeE6 = reader.readSint32();
            } else if (i2 == 6 && i3 == 0) {
                notice.triggerDistanceM = reader.readInt();
            } else if (i2 == 7 && i3 == 0) {
                notice.valueKmh = reader.readInt();
                notice.hasValueKmh = true;
            } else if (i2 == 9 && i3 == 0) {
                notice.sideRule = reader.readInt();
            } else {
                reader.skipField(i3);
            }
        }
        if (notice.id.length() == 0 || notice.type <= 0 || notice.triggerDistanceM <= 0 || notice.triggerDistanceM > 1000 || notice.sideRule != 1) {
            throw new ParseException("invalid point notice");
        }
        return notice;
    }

    private static long scanBucketKey(byte[] bArr, int i2, int i3) {
        Reader reader = new Reader(bArr, i2, i3);
        int i4 = -1;
        int i5 = -1;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i6 = tag >>> 3;
            int i7 = tag & 7;
            if (i6 == 1 && i7 == 0) {
                i4 = reader.readInt();
            } else if (i6 == 2 && i7 == 0) {
                i5 = reader.readInt();
            } else {
                reader.skipField(i7);
            }
        }
        if (i4 < 0 || i5 < 0) {
            throw new ParseException("bucket without coordinates");
        }
        return tileKey(i4, i5);
    }

    private static long tileKey(int i2, int i3) {
        return (i3 & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (i2 << 32);
    }

    private static int tileX(double d2, int i2) {
        double d3 = 1 << i2;
        Double.isNaN(d3);
        return (int) Math.floor(((d2 + 180.0d) / 360.0d) * d3);
    }

    private static int tileY(double d2, int i2) {
        double radians = Math.toRadians(Math.max(-85.05112878d, Math.min(85.05112878d, d2)));
        double dLog = (1.0d - (Math.log(Math.tan(radians) + (1.0d / Math.cos(radians))) / 3.141592653589793d)) * 0.5d;
        double d3 = 1 << i2;
        Double.isNaN(d3);
        return (int) Math.floor(dLog * d3);
    }

    static final class Notice {
        static final int RIGHT_OF_TRAVEL = 1;
        boolean hasValueKmh;
        String id = "";
        int latitudeE6;
        int longitudeE6;
        int sideRule;
        int triggerDistanceM;
        int type;
        int valueKmh;

        Notice() {
        }

        double longitude() {
            double d2 = this.longitudeE6;
            Double.isNaN(d2);
            return d2 / 1000000.0d;
        }

        double latitude() {
            double d2 = this.latitudeE6;
            Double.isNaN(d2);
            return d2 / 1000000.0d;
        }
    }

    private static final class IndexEntry {
        final long key;
        final int length;
        final int offset;

        IndexEntry(long j2, int i2, int i3) {
            this.key = j2;
            this.offset = i2;
            this.length = i3;
        }
    }

    private static final class Reader {
        final byte[] data;
        final int end;
        int position;

        Reader(byte[] bArr, int i2, int i3) {
            if (i2 < 0 || i3 < 0 || i2 > bArr.length - i3) {
                throw new ParseException("invalid bounds");
            }
            this.data = bArr;
            this.position = i2;
            this.end = i2 + i3;
        }

        boolean hasRemaining() {
            return this.position < this.end;
        }

        int position() {
            return this.position;
        }

        Reader child(int i2) {
            return new Reader(this.data, this.position, i2);
        }

        int readTag() {
            long varint = readVarint();
            if (varint <= 0 || varint > SieveCacheKt.NodeLinkMask) {
                throw new ParseException("bad tag");
            }
            return (int) varint;
        }

        int readLength() {
            long varint = readVarint();
            if (varint < 0 || varint > SieveCacheKt.NodeLinkMask || varint > this.end - this.position) {
                throw new ParseException("bad length");
            }
            return (int) varint;
        }

        int readInt() {
            long varint = readVarint();
            if (varint < 0 || varint > SieveCacheKt.NodeLinkMask) {
                throw new ParseException("integer overflow");
            }
            return (int) varint;
        }

        int readSint32() {
            long varint = readVarint();
            return (int) ((-(varint & 1)) ^ (varint >>> 1));
        }

        long readVarint() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                if (this.position >= this.end) {
                    throw new ParseException("truncated varint");
                }
                byte[] bArr = this.data;
                int i3 = this.position;
                this.position = i3 + 1;
                j2 |= (r3 & 127) << i2;
                if ((bArr[i3] & 255 & 128) == 0) {
                    return j2;
                }
            }
            throw new ParseException("varint overflow");
        }

        String readString() {
            int length = readLength();
            String str = new String(this.data, this.position, length, PointNoticeDatabase.UTF_8);
            this.position += length;
            return str;
        }

        void skipBytes(int i2) {
            if (i2 < 0 || i2 > this.end - this.position) {
                throw new ParseException("truncated bytes");
            }
            this.position += i2;
        }

        void skipField(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 5) {
                            throw new ParseException("unsupported wire type");
                        }
                        skipBytes(4);
                        return;
                    }
                    skipBytes(readLength());
                    return;
                }
                skipBytes(8);
                return;
            }
            readVarint();
        }
    }

    static final class ParseException extends IllegalArgumentException {
        ParseException(String str) {
            super(str);
        }
    }
}
