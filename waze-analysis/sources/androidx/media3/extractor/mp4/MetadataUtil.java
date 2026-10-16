package androidx.media3.extractor.mp4;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.Id3Util;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import com.google.d.d.bn;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class MetadataUtil {
    private static final int PICTURE_TYPE_FRONT_COVER = 3;
    private static final int SHORT_TYPE_ALBUM = 6384738;
    private static final int SHORT_TYPE_ARTIST = 4280916;
    private static final int SHORT_TYPE_COMMENT = 6516084;
    private static final int SHORT_TYPE_COMPOSER_1 = 6516589;
    private static final int SHORT_TYPE_COMPOSER_2 = 7828084;
    private static final int SHORT_TYPE_ENCODER = 7630703;
    private static final int SHORT_TYPE_GENRE = 6776174;
    private static final int SHORT_TYPE_LYRICS = 7108978;
    private static final int SHORT_TYPE_MOVEMENT_INDEX = 7173737;
    private static final int SHORT_TYPE_MOVEMENT_NAME = 7173742;
    private static final int SHORT_TYPE_NAME_1 = 7233901;
    private static final int SHORT_TYPE_NAME_2 = 7631467;
    private static final int SHORT_TYPE_YEAR = 6578553;
    private static final String TAG = "MetadataUtil";
    private static final int TYPE_ALBUM_ARTIST = 1631670868;
    private static final int TYPE_COMPILATION = 1668311404;
    private static final int TYPE_COVER_ART = 1668249202;
    private static final int TYPE_DISK_NUMBER = 1684632427;
    private static final int TYPE_GAPLESS_ALBUM = 1885823344;
    private static final int TYPE_GENRE = 1735291493;
    private static final int TYPE_GROUPING = 6779504;
    private static final int TYPE_INTERNAL = 757935405;
    private static final int TYPE_RATING = 1920233063;
    private static final int TYPE_SORT_ALBUM = 1936679276;
    private static final int TYPE_SORT_ALBUM_ARTIST = 1936679265;
    private static final int TYPE_SORT_ARTIST = 1936679282;
    private static final int TYPE_SORT_COMPOSER = 1936679791;
    private static final int TYPE_SORT_TRACK_NAME = 1936682605;
    private static final int TYPE_TEMPO = 1953329263;
    private static final int TYPE_TOP_BYTE_COPYRIGHT = 169;
    private static final int TYPE_TOP_BYTE_REPLACEMENT = 253;
    private static final int TYPE_TRACK_NUMBER = 1953655662;
    private static final int TYPE_TV_SHOW = 1953919848;
    private static final int TYPE_TV_SORT_SHOW = 1936683886;

    private MetadataUtil() {
    }

    @Deprecated
    public static MdtaMetadataEntry findMdtaMetadataEntryWithKey(Metadata metadata, String str) {
        for (int i2 = 0; i2 < metadata.length(); i2++) {
            Metadata.Entry entry = metadata.get(i2);
            if (entry instanceof MdtaMetadataEntry) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entry;
                if (mdtaMetadataEntry.key.equals(str)) {
                    return mdtaMetadataEntry;
                }
            }
        }
        return null;
    }

    private static CommentFrame parseCommentAttribute(int i2, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w(TAG, "Failed to parse comment attribute: ".concat(Mp4Box.getBoxTypeString(i2)));
            return null;
        }
        parsableByteArray.skipBytes(8);
        String nullTerminatedString = parsableByteArray.readNullTerminatedString(i3 - 16);
        return new CommentFrame(C.LANGUAGE_UNDETERMINED, nullTerminatedString, nullTerminatedString);
    }

    private static ApicFrame parseCoverArt(ParsableByteArray parsableByteArray) {
        String str;
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() != 1684108385) {
            Log.w(TAG, "Failed to parse cover art attribute");
            return null;
        }
        int fullBoxFlags = BoxParser.parseFullBoxFlags(parsableByteArray.readInt());
        if (fullBoxFlags == 13) {
            str = MimeTypes.IMAGE_JPEG;
        } else if (fullBoxFlags == 14) {
            str = MimeTypes.IMAGE_PNG;
            fullBoxFlags = 14;
        } else {
            str = null;
        }
        if (str == null) {
            Log.w(TAG, "Unrecognized cover art flags: " + fullBoxFlags);
            return null;
        }
        parsableByteArray.skipBytes(4);
        int i3 = i2 - 16;
        byte[] bArr = new byte[i3];
        parsableByteArray.readBytes(bArr, 0, i3);
        return new ApicFrame(str, null, 3, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01bc A[Catch: all -> 0x01e1, TryCatch #0 {all -> 0x01e1, blocks: (B:7:0x0020, B:9:0x0028, B:10:0x003d, B:17:0x0050, B:20:0x005b, B:23:0x0068, B:26:0x0075, B:29:0x0082, B:34:0x0093, B:37:0x009e, B:40:0x00ab, B:43:0x00b8, B:46:0x00c5, B:49:0x00d2, B:52:0x00df, B:55:0x00ec, B:58:0x00f9, B:61:0x0106, B:64:0x0113, B:67:0x0120, B:108:0x01bc, B:68:0x0126, B:70:0x012f, B:83:0x0152, B:86:0x015f, B:89:0x016c, B:92:0x0179, B:95:0x0185, B:98:0x0191, B:101:0x019d, B:104:0x01a9, B:107:0x01b5, B:109:0x01d0, B:110:0x01d7), top: B:116:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.common.Metadata.Entry parseIlstElement(androidx.media3.common.util.ParsableByteArray r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.MetadataUtil.parseIlstElement(androidx.media3.common.util.ParsableByteArray, boolean):androidx.media3.common.Metadata$Entry");
    }

    private static TextInformationFrame parseIndexAndCountAttribute(int i2, String str, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385 && i3 >= 22) {
            parsableByteArray.skipBytes(10);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            if (unsignedShort > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(unsignedShort);
                String string = sb.toString();
                int unsignedShort2 = parsableByteArray.readUnsignedShort();
                if (unsignedShort2 > 0) {
                    string = string + DomExceptionUtils.SEPARATOR + unsignedShort2;
                }
                return new TextInformationFrame(str, (String) null, bn.q(string));
            }
        }
        Log.w(TAG, "Failed to parse index/count attribute: ".concat(Mp4Box.getBoxTypeString(i2)));
        return null;
    }

    private static int parseIntegerAttribute(ParsableByteArray parsableByteArray) {
        int i2 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            int i3 = i2 - 16;
            if (i3 == 1) {
                return parsableByteArray.readUnsignedByte();
            }
            if (i3 == 2) {
                return parsableByteArray.readUnsignedShort();
            }
            if (i3 == 3) {
                return parsableByteArray.readUnsignedInt24();
            }
            if (i3 == 4 && (parsableByteArray.peekUnsignedByte() & 128) == 0) {
                return parsableByteArray.readUnsignedIntToInt();
            }
        }
        Log.w(TAG, "Failed to parse data atom to int");
        return -1;
    }

    private static Id3Frame parseInternalAttribute(ParsableByteArray parsableByteArray, int i2) {
        int i3 = -1;
        int i4 = -1;
        String nullTerminatedString = null;
        String nullTerminatedString2 = null;
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i5 = parsableByteArray.readInt();
            int i6 = i5 - 12;
            int i7 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            if (i7 == 1835360622) {
                nullTerminatedString = parsableByteArray.readNullTerminatedString(i6);
            } else if (i7 == 1851878757) {
                nullTerminatedString2 = parsableByteArray.readNullTerminatedString(i6);
            } else {
                if (i7 == 1684108385) {
                    i4 = i5;
                }
                if (i7 == 1684108385) {
                    i3 = position;
                }
                parsableByteArray.skipBytes(i6);
            }
        }
        if (nullTerminatedString == null || nullTerminatedString2 == null || i3 == -1) {
            return null;
        }
        parsableByteArray.setPosition(i3);
        parsableByteArray.skipBytes(16);
        return new InternalFrame(nullTerminatedString, nullTerminatedString2, parsableByteArray.readNullTerminatedString(i4 - 16));
    }

    public static MdtaMetadataEntry parseMdtaMetadataEntryFromIlst(ParsableByteArray parsableByteArray, int i2, String str) {
        while (true) {
            int position = parsableByteArray.getPosition();
            if (position >= i2) {
                return null;
            }
            int i3 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1684108385) {
                int i4 = parsableByteArray.readInt();
                int i5 = parsableByteArray.readInt();
                int i6 = i3 - 16;
                byte[] bArr = new byte[i6];
                parsableByteArray.readBytes(bArr, 0, i6);
                try {
                    return new MdtaMetadataEntry(str, bArr, i5, i4);
                } catch (Exception unused) {
                    Log.w(TAG, "Failed to parse metadata entry with key: ".concat(String.valueOf(str)));
                    return null;
                }
            }
            parsableByteArray.setPosition(position + i3);
        }
    }

    private static TextInformationFrame parseStandardGenreAttribute(ParsableByteArray parsableByteArray) {
        String strResolveV1Genre = Id3Util.resolveV1Genre(parseIntegerAttribute(parsableByteArray) - 1);
        if (strResolveV1Genre != null) {
            return new TextInformationFrame("TCON", (String) null, bn.q(strResolveV1Genre));
        }
        Log.w(TAG, "Failed to parse standard genre code");
        return null;
    }

    private static TextInformationFrame parseTextAttribute(int i2, String str, ParsableByteArray parsableByteArray) {
        int i3 = parsableByteArray.readInt();
        if (parsableByteArray.readInt() == 1684108385) {
            parsableByteArray.skipBytes(8);
            return new TextInformationFrame(str, (String) null, bn.q(parsableByteArray.readNullTerminatedString(i3 - 16)));
        }
        Log.w(TAG, "Failed to parse text attribute: ".concat(Mp4Box.getBoxTypeString(i2)));
        return null;
    }

    public static void setFormatGaplessInfo(int i2, GaplessInfoHolder gaplessInfoHolder, Format.Builder builder) {
        if (i2 == 1 && gaplessInfoHolder.hasGaplessInfo()) {
            builder.setEncoderDelay(gaplessInfoHolder.encoderDelay);
            builder.setEncoderPadding(gaplessInfoHolder.encoderPadding);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void setFormatMetadata(int i2, Metadata metadata, Format.Builder builder, Metadata metadata2, Metadata... metadataArr) {
        if (metadata2 == null) {
            metadata2 = new Metadata(new Metadata.Entry[0]);
        }
        if (metadata != null) {
            bn entriesOfType = metadata.getEntriesOfType(MdtaMetadataEntry.class);
            int size = entriesOfType.size();
            for (int i3 = 0; i3 < size; i3++) {
                MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) entriesOfType.get(i3);
                if (!mdtaMetadataEntry.key.equals(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS) || i2 == 2) {
                    metadata2 = metadata2.copyWithAppendedEntries(mdtaMetadataEntry);
                }
            }
        }
        for (Metadata metadata3 : metadataArr) {
            metadata2 = metadata2.copyWithAppendedEntriesFrom(metadata3);
        }
        if (metadata2.length() > 0) {
            builder.setMetadata(metadata2);
        }
    }

    private static Id3Frame parseIntegerAttribute(int i2, String str, ParsableByteArray parsableByteArray, boolean z, boolean z2) {
        int integerAttribute = parseIntegerAttribute(parsableByteArray);
        if (z2) {
            integerAttribute = Math.min(1, integerAttribute);
        }
        if (integerAttribute < 0) {
            Log.w(TAG, "Failed to parse uint8 attribute: ".concat(Mp4Box.getBoxTypeString(i2)));
            return null;
        }
        if (z) {
            return new TextInformationFrame(str, (String) null, bn.q(Integer.toString(integerAttribute)));
        }
        return new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(integerAttribute));
    }
}
