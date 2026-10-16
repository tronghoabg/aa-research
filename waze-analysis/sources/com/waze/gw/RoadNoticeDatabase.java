package com.waze.gw;

import androidx.collection.SieveCacheKt;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes10.dex */
final class RoadNoticeDatabase {
    static final int DAY_EVEN = 3;
    static final int DAY_EVERY = 1;
    static final int DAY_ODD = 2;
    static final int DIRECTION_BOTH = 1;
    static final int DIRECTION_FORWARD = 2;
    static final int DIRECTION_REVERSE = 3;
    static final int POINT_SPATIAL_ZOOM = 14;
    static final int SUPPORTED_SCHEMA = 2;
    static final int TRIGGER_ENTER_SEGMENT = 1;
    static final int TYPE_EXPRESSWAY_EXIT = 9;
    static final int TYPE_EXPRESSWAY_REST_STOP = 8;
    static final int TYPE_MINIMUM_SPEED = 1;
    static final int TYPE_NO_PARKING = 2;
    static final int TYPE_NO_STOPPING = 3;
    static final int TYPE_REST_STOP = 7;
    static final int TYPE_VOICE_NOTICE = 4;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    final byte[] bytes;
    final long datasetVersion;
    final long generatedAtMs;
    final int[] pointLengths;
    final int[] pointOffsets;
    final long[] pointTileKeys;
    final int[] recordLengths;
    final int[] recordOffsets;
    final int schemaVersion;
    final long[] segmentIds;
    final long targetMapBuildId;

    private RoadNoticeDatabase(byte[] bArr, int i2, long j2, long j3, long j4, List<IndexEntry> list, List<PointIndexEntry> list2) {
        this.bytes = bArr;
        this.schemaVersion = i2;
        this.datasetVersion = j2;
        this.targetMapBuildId = j3;
        this.generatedAtMs = j4;
        Collections.sort(list, new Comparator<IndexEntry>() { // from class: com.waze.gw.RoadNoticeDatabase.1
            @Override // java.util.Comparator
            public int compare(IndexEntry indexEntry, IndexEntry indexEntry2) {
                if (indexEntry.segmentId < indexEntry2.segmentId) {
                    return -1;
                }
                return indexEntry.segmentId == indexEntry2.segmentId ? 0 : 1;
            }
        });
        this.segmentIds = new long[list.size()];
        this.recordOffsets = new int[list.size()];
        this.recordLengths = new int[list.size()];
        long j5 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            IndexEntry indexEntry = list.get(i3);
            if (indexEntry.segmentId <= 0 || indexEntry.segmentId == j5) {
                throw new ParseException("invalid or duplicate segment id");
            }
            j5 = indexEntry.segmentId;
            this.segmentIds[i3] = indexEntry.segmentId;
            this.recordOffsets[i3] = indexEntry.offset;
            this.recordLengths[i3] = indexEntry.length;
        }
        Collections.sort(list2, new Comparator<PointIndexEntry>() { // from class: com.waze.gw.RoadNoticeDatabase.2
            @Override // java.util.Comparator
            public int compare(PointIndexEntry pointIndexEntry, PointIndexEntry pointIndexEntry2) {
                if (pointIndexEntry.tileKey < pointIndexEntry2.tileKey) {
                    return -1;
                }
                if (pointIndexEntry.tileKey > pointIndexEntry2.tileKey) {
                    return 1;
                }
                if (pointIndexEntry.offset < pointIndexEntry2.offset) {
                    return -1;
                }
                return pointIndexEntry.offset == pointIndexEntry2.offset ? 0 : 1;
            }
        });
        this.pointTileKeys = new long[list2.size()];
        this.pointOffsets = new int[list2.size()];
        this.pointLengths = new int[list2.size()];
        for (int i4 = 0; i4 < list2.size(); i4++) {
            PointIndexEntry pointIndexEntry = list2.get(i4);
            this.pointTileKeys[i4] = pointIndexEntry.tileKey;
            this.pointOffsets[i4] = pointIndexEntry.offset;
            this.pointLengths[i4] = pointIndexEntry.length;
        }
    }

    static RoadNoticeDatabase parse(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw new ParseException("empty database");
        }
        Reader reader = new Reader(bArr, 0, bArr.length);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long varint = 0;
        long j2 = 0;
        int iCheckedInt = 0;
        long varint2 = 0;
        long varint3 = 0;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i2 = tag >>> 3;
            int i3 = tag & 7;
            long j3 = j2;
            if (i2 == 1 && i3 == 0) {
                iCheckedInt = checkedInt(reader.readVarint());
            } else if (i2 == 2 && i3 == 0) {
                varint2 = reader.readVarint();
            } else if (i2 == 3 && i3 == 0) {
                varint3 = reader.readVarint();
            } else if (i2 == 4 && i3 == 0) {
                varint = reader.readVarint();
            } else if (i2 == 5 && i3 == 2) {
                int length = reader.readLength();
                int iPosition = reader.position();
                arrayList.add(new IndexEntry(scanSegmentId(bArr, iPosition, length), iPosition, length));
                reader.skipBytes(length);
            } else if (i2 == 6 && i3 == 2) {
                int length2 = reader.readLength();
                arrayList2.add(scanPointIndex(bArr, reader.position(), length2));
                reader.skipBytes(length2);
            } else {
                reader.skipField(i3);
            }
            j2 = j3;
        }
        long j4 = j2;
        if (iCheckedInt != 2) {
            throw new ParseException("unsupported schema " + iCheckedInt);
        }
        if (varint2 > j4 && varint3 > j4 && varint > j4) {
            return new RoadNoticeDatabase(bArr, iCheckedInt, varint2, varint3, varint, arrayList, arrayList2);
        }
        throw new ParseException("missing database metadata");
    }

    List<PointRecord> nearbyPoints(double d2, double d3) {
        int iTileX = tileX(d3, 14);
        int iTileY = tileY(d2, 14);
        ArrayList arrayList = new ArrayList();
        for (int i2 = -2; i2 <= 2; i2++) {
            for (int i3 = -2; i3 <= 2; i3++) {
                long jTileKey = tileKey(iTileX + i3, iTileY + i2);
                for (int iLowerBound = lowerBound(this.pointTileKeys, jTileKey); iLowerBound < this.pointTileKeys.length && this.pointTileKeys[iLowerBound] == jTileKey; iLowerBound++) {
                    arrayList.add(parsePoint(this.pointOffsets[iLowerBound], this.pointLengths[iLowerBound]));
                }
            }
        }
        return arrayList;
    }

    SegmentRecord find(long j2) {
        int length = this.segmentIds.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = this.segmentIds[i3];
            if (j3 < j2) {
                i2 = i3 + 1;
            } else {
                if (j3 <= j2) {
                    return parseRecord(this.recordOffsets[i3], this.recordLengths[i3]);
                }
                length = i3 - 1;
            }
        }
        return null;
    }

    private SegmentRecord parseRecord(int i2, int i3) {
        Reader reader = new Reader(this.bytes, i2, i3);
        ArrayList arrayList = new ArrayList();
        long varint = 0;
        long varint2 = -1;
        long varint3 = -1;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i4 = tag >>> 3;
            int i5 = tag & 7;
            if (i4 == 1 && i5 == 0) {
                varint = reader.readVarint();
            } else if (i4 == 2 && i5 == 0) {
                varint2 = reader.readVarint();
            } else if (i4 == 3 && i5 == 0) {
                varint3 = reader.readVarint();
            } else if (i4 == 4 && i5 == 2) {
                int length = reader.readLength();
                arrayList.add(parseNotice(reader.child(length)));
                reader.skipBytes(length);
            } else {
                reader.skipField(i5);
            }
        }
        if (varint <= 0) {
            throw new ParseException("record without segment id");
        }
        return new SegmentRecord(varint, varint2, varint3, arrayList);
    }

    private PointRecord parsePoint(int i2, int i3) {
        Reader reader = new Reader(this.bytes, i2, i3);
        ArrayList arrayList = new ArrayList();
        Notice notice = null;
        int sint32 = 0;
        int sint322 = 0;
        int iCheckedInt = -1;
        int iCheckedInt2 = 0;
        long varint = 0;
        boolean z = false;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i4 = tag >>> 3;
            int i5 = tag & 7;
            if (i4 == 1 && i5 == 0) {
                sint32 = reader.readSint32();
            } else if (i4 == 2 && i5 == 0) {
                sint322 = reader.readSint32();
            } else if (i4 == 3 && i5 == 0) {
                iCheckedInt = checkedInt(reader.readVarint());
            } else if (i4 == 4 && i5 == 0) {
                iCheckedInt2 = checkedInt(reader.readVarint());
            } else if (i4 == 5 && i5 == 0) {
                varint = reader.readVarint();
            } else if (i4 == 6 && i5 == 0) {
                z = reader.readVarint() != 0;
            } else if (i4 == 7 && i5 == 2) {
                int length = reader.readLength();
                Notice notice2 = parseNotice(reader.child(length));
                reader.skipBytes(length);
                notice = notice2;
            } else if (i4 == 8 && i5 == 0) {
                arrayList.add(Long.valueOf(reader.readVarint()));
            } else if (i4 == 8 && i5 == 2) {
                int length2 = reader.readLength();
                Reader readerChild = reader.child(length2);
                while (readerChild.hasRemaining()) {
                    arrayList.add(Long.valueOf(readerChild.readVarint()));
                }
                reader.skipBytes(length2);
            } else {
                reader.skipField(i5);
            }
        }
        if ((arrayList.isEmpty() && iCheckedInt < 0) || iCheckedInt >= 36000 || iCheckedInt2 < 50 || iCheckedInt2 > 3000 || notice == null || notice.noticeId.length() == 0) {
            throw new ParseException("invalid road point");
        }
        int size = arrayList.size();
        long[] jArr = new long[size];
        for (int i6 = 0; i6 < size; i6++) {
            long jLongValue = ((Long) arrayList.get(i6)).longValue();
            if (jLongValue <= 0) {
                throw new ParseException("invalid approach segment");
            }
            jArr[i6] = jLongValue;
        }
        return new PointRecord(sint32, sint322, iCheckedInt, iCheckedInt2, varint, z, notice, jArr);
    }

    private static Notice parseNotice(Reader reader) {
        Notice notice = new Notice();
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i2 = tag >>> 3;
            int i3 = tag & 7;
            if (i2 == 1 && i3 == 2) {
                notice.noticeId = reader.readString();
            } else if (i2 == 2 && i3 == 0) {
                notice.direction = checkedInt(reader.readVarint());
            } else if (i2 == 3 && i3 == 0) {
                notice.type = checkedInt(reader.readVarint());
            } else if (i2 == 4 && i3 == 0) {
                notice.priority = (int) reader.readVarint();
            } else if (i2 == 5 && i3 == 0) {
                notice.triggerMode = checkedInt(reader.readVarint());
            } else if (i2 == 6 && i3 == 0) {
                reader.readVarint();
            } else if (i2 == 6 && i3 == 2) {
                reader.skipBytes(reader.readLength());
            } else if (i2 == 7 && i3 == 0) {
                notice.valueKmh = (int) reader.readVarint();
                notice.hasValueKmh = true;
            } else if (i2 == 8 && i3 == 2) {
                notice.title = reader.readString();
            } else if (i2 == 9 && i3 == 2) {
                notice.message = reader.readString();
            } else if (i2 == 10 && i3 == 2) {
                notice.voiceText = reader.readString();
            } else if (i2 == 13 && i3 == 0) {
                notice.cooldownSeconds = checkedInt(reader.readVarint());
            } else if (i2 == 14 && i3 == 0) {
                notice.maxRepeatsPerTrip = checkedInt(reader.readVarint());
            } else if (i2 == 15 && i3 == 0) {
                notice.validFromMs = reader.readVarint();
                notice.hasValidFrom = true;
            } else if (i2 == 16 && i3 == 0) {
                notice.validUntilMs = reader.readVarint();
                notice.hasValidUntil = true;
            } else if (i2 == 17 && i3 == 0) {
                notice.enabled = reader.readVarint() != 0;
            } else if (i2 == 19 && i3 == 2) {
                int length = reader.readLength();
                notice.schedule = parseSchedule(reader.child(length));
                reader.skipBytes(length);
            } else {
                reader.skipField(i3);
            }
        }
        if (notice.noticeId == null) {
            notice.noticeId = "";
        }
        return notice;
    }

    private static RestrictionSchedule parseSchedule(Reader reader) {
        RestrictionSchedule restrictionSchedule = new RestrictionSchedule();
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i2 = tag >>> 3;
            int i3 = tag & 7;
            if (i2 == 1 && i3 == 0) {
                restrictionSchedule.dayRule = checkedInt(reader.readVarint());
            } else if (i2 == 2 && i3 == 0) {
                restrictionSchedule.startMinute = checkedInt(reader.readVarint());
                restrictionSchedule.hasLegacyRange = true;
            } else if (i2 == 3 && i3 == 0) {
                restrictionSchedule.endMinute = checkedInt(reader.readVarint());
                restrictionSchedule.hasLegacyRange = true;
            } else if (i2 == 4 && i3 == 2) {
                int length = reader.readLength();
                restrictionSchedule.ranges.add(parseRange(reader.child(length)));
                reader.skipBytes(length);
            } else {
                reader.skipField(i3);
            }
        }
        return restrictionSchedule;
    }

    private static TimeRange parseRange(Reader reader) {
        int iCheckedInt = 0;
        int iCheckedInt2 = 0;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i2 = tag >>> 3;
            int i3 = tag & 7;
            if (i2 == 1 && i3 == 0) {
                iCheckedInt = checkedInt(reader.readVarint());
            } else if (i2 == 2 && i3 == 0) {
                iCheckedInt2 = checkedInt(reader.readVarint());
            } else {
                reader.skipField(i3);
            }
        }
        return new TimeRange(iCheckedInt, iCheckedInt2);
    }

    private static long scanSegmentId(byte[] bArr, int i2, int i3) {
        Reader reader = new Reader(bArr, i2, i3);
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i4 = tag >>> 3;
            int i5 = tag & 7;
            if (i4 == 1 && i5 == 0) {
                return reader.readVarint();
            }
            reader.skipField(i5);
        }
        throw new ParseException("segment record has no id");
    }

    private static PointIndexEntry scanPointIndex(byte[] bArr, int i2, int i3) {
        Reader reader = new Reader(bArr, i2, i3);
        boolean z = false;
        boolean z2 = false;
        int sint32 = 0;
        int sint322 = 0;
        while (reader.hasRemaining()) {
            int tag = reader.readTag();
            int i4 = tag >>> 3;
            int i5 = tag & 7;
            if (i4 == 1 && i5 == 0) {
                sint32 = reader.readSint32();
                z = true;
            } else if (i4 == 2 && i5 == 0) {
                sint322 = reader.readSint32();
                z2 = true;
            } else {
                reader.skipField(i5);
            }
        }
        if (!z || !z2 || sint32 < -90000000 || sint32 > 90000000 || sint322 < -180000000 || sint322 > 180000000) {
            throw new ParseException("road point without valid coordinates");
        }
        double d2 = sint322;
        Double.isNaN(d2);
        int iTileX = tileX(d2 / 1000000.0d, 14);
        double d3 = sint32;
        Double.isNaN(d3);
        return new PointIndexEntry(tileKey(iTileX, tileY(d3 / 1000000.0d, 14)), i2, i3);
    }

    private static int lowerBound(long[] jArr, long j2) {
        int length = jArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = (i2 + length) >>> 1;
            if (jArr[i3] < j2) {
                i2 = i3 + 1;
            } else {
                length = i3;
            }
        }
        return i2;
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

    private static int checkedInt(long j2) {
        if (j2 < 0 || j2 > SieveCacheKt.NodeLinkMask) {
            throw new ParseException("integer overflow");
        }
        return (int) j2;
    }

    static final class SegmentRecord {
        final long fromNodeId;
        final List<Notice> notices;
        final long segmentId;
        final long toNodeId;

        SegmentRecord(long j2, long j3, long j4, List<Notice> list) {
            this.segmentId = j2;
            this.fromNodeId = j3;
            this.toNodeId = j4;
            this.notices = list;
        }
    }

    static final class Notice {
        int cooldownSeconds;
        int direction;
        boolean enabled;
        boolean hasValidFrom;
        boolean hasValidUntil;
        boolean hasValueKmh;
        int maxRepeatsPerTrip;
        int priority;
        RestrictionSchedule schedule;
        int triggerMode;
        int type;
        long validFromMs;
        long validUntilMs;
        int valueKmh;
        String noticeId = "";
        String title = "";
        String message = "";
        String voiceText = "";

        Notice() {
        }
    }

    static final class PointRecord {
        final int approachBearingCdeg;
        final long[] approachSegmentIds;
        final int latitudeE6;
        final int longitudeE6;
        final long matchedSegmentId;
        final Notice notice;
        final boolean routeOnly;
        final int triggerDistanceM;

        PointRecord(int i2, int i3, int i4, int i5, long j2, boolean z, Notice notice, long[] jArr) {
            this.latitudeE6 = i2;
            this.longitudeE6 = i3;
            this.approachBearingCdeg = i4;
            this.triggerDistanceM = i5;
            this.matchedSegmentId = j2;
            this.routeOnly = z;
            this.notice = notice;
            this.approachSegmentIds = jArr == null ? new long[0] : jArr;
        }

        double latitude() {
            double d2 = this.latitudeE6;
            Double.isNaN(d2);
            return d2 / 1000000.0d;
        }

        double longitude() {
            double d2 = this.longitudeE6;
            Double.isNaN(d2);
            return d2 / 1000000.0d;
        }

        double approachBearing() {
            double d2 = this.approachBearingCdeg;
            Double.isNaN(d2);
            return d2 / 100.0d;
        }

        boolean hasApproachSegment(long j2) {
            if (j2 <= 0) {
                return false;
            }
            for (long j3 : this.approachSegmentIds) {
                if (j3 == j2) {
                    return true;
                }
            }
            return false;
        }
    }

    static final class RestrictionSchedule {
        int dayRule;
        int endMinute;
        boolean hasLegacyRange;
        final List<TimeRange> ranges = new ArrayList();
        int startMinute;

        RestrictionSchedule() {
        }
    }

    static final class TimeRange {
        final int endMinute;
        final int startMinute;

        TimeRange(int i2, int i3) {
            this.startMinute = i2;
            this.endMinute = i3;
        }
    }

    private static final class IndexEntry {
        final int length;
        final int offset;
        final long segmentId;

        IndexEntry(long j2, int i2, int i3) {
            this.segmentId = j2;
            this.offset = i2;
            this.length = i3;
        }
    }

    private static final class PointIndexEntry {
        final int length;
        final int offset;
        final long tileKey;

        PointIndexEntry(long j2, int i2, int i3) {
            this.tileKey = j2;
            this.offset = i2;
            this.length = i3;
        }
    }

    static final class ParseException extends IllegalArgumentException {
        private static final long serialVersionUID = 1;

        ParseException(String str) {
            super(str);
        }
    }

    private static final class Reader {
        private final byte[] bytes;
        private final int end;
        private int position;

        Reader(byte[] bArr, int i2, int i3) {
            if (bArr == null || i2 < 0 || i3 < 0 || i2 > bArr.length - i3) {
                throw new ParseException("invalid bounds");
            }
            this.bytes = bArr;
            this.position = i2;
            this.end = i2 + i3;
        }

        boolean hasRemaining() {
            return this.position < this.end;
        }

        int position() {
            return this.position;
        }

        int readTag() {
            long varint = readVarint();
            if (varint <= 0 || varint > SieveCacheKt.NodeLinkMask || (varint >>> 3) == 0) {
                throw new ParseException("invalid tag");
            }
            return (int) varint;
        }

        long readVarint() {
            long j2 = 0;
            for (int i2 = 0; i2 < 64; i2 += 7) {
                if (this.position >= this.end) {
                    throw new ParseException("truncated varint");
                }
                byte[] bArr = this.bytes;
                int i3 = this.position;
                this.position = i3 + 1;
                int i4 = bArr[i3] & 255;
                if (i2 == 63 && (i4 & DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2) != 0) {
                    throw new ParseException("varint overflow");
                }
                j2 |= (i4 & 127) << i2;
                if ((i4 & 128) == 0) {
                    return j2;
                }
            }
            throw new ParseException("varint too long");
        }

        int readSint32() {
            long varint = readVarint();
            return (int) ((-(varint & 1)) ^ (varint >>> 1));
        }

        int readLength() {
            long varint = readVarint();
            if (varint < 0 || varint > SieveCacheKt.NodeLinkMask || varint > this.end - this.position) {
                throw new ParseException("invalid length");
            }
            return (int) varint;
        }

        String readString() {
            int length = readLength();
            String str = new String(this.bytes, this.position, length, RoadNoticeDatabase.UTF_8);
            this.position += length;
            return str;
        }

        Reader child(int i2) {
            return new Reader(this.bytes, this.position, i2);
        }

        void skipBytes(int i2) {
            if (i2 < 0 || i2 > this.end - this.position) {
                throw new ParseException("truncated field");
            }
            this.position += i2;
        }

        void skipField(int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 5) {
                            throw new ParseException("unsupported wire type " + i2);
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
}
