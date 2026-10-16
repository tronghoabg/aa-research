package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.Pair;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.collection.SieveCacheKt;
import androidx.core.util.Preconditions;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.waze.strings.DisplayStrings;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ExifData {
    private static final String COMPONENTS_CONFIGURATION_YCBCR;
    private static final boolean DEBUG = false;
    static final ExifTag[] EXIF_POINTER_TAGS;
    static final ExifTag[][] EXIF_TAGS;
    private static final ExifTag[] IFD_EXIF_TAGS;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    private static final ExifTag[] IFD_GPS_TAGS;
    private static final ExifTag[] IFD_INTEROPERABILITY_TAGS;
    private static final ExifTag[] IFD_TIFF_TAGS;
    static final int IFD_TYPE_EXIF = 1;
    static final int IFD_TYPE_GPS = 2;
    static final int IFD_TYPE_INTEROPERABILITY = 3;
    static final int IFD_TYPE_PRIMARY = 0;
    private static final int MM_IN_MICRONS = 1000;
    private static final String TAG = "ExifData";
    static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    static final HashSet<String> sTagSetForCompatibility;
    private final List<Map<String, ExifAttribute>> mAttributes;
    private final ByteOrder mByteOrder;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.core.impl.utils.ExifData$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState;

        static {
            int[] iArr = new int[CameraCaptureMetaData.FlashState.values().length];
            $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState = iArr;
            try {
                iArr[CameraCaptureMetaData.FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[CameraCaptureMetaData.FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$camera$core$impl$CameraCaptureMetaData$FlashState[CameraCaptureMetaData.FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Builder {
        private static final int DATETIME_VALUE_STRING_LENGTH = 19;
        final List<Map<String, ExifAttribute>> mAttributes = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.2
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public Map<String, ExifAttribute> nextElement() {
                this.mIfdIndex++;
                return new HashMap();
            }
        });
        private final ByteOrder mByteOrder;
        private static final Pattern GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        static final List<HashMap<String, ExifTag>> sExifTagMapsForWriting = Collections.list(new Enumeration<HashMap<String, ExifTag>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.1
            int mIfdIndex = 0;

            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return this.mIfdIndex < ExifData.EXIF_TAGS.length;
            }

            @Override // java.util.Enumeration
            public HashMap<String, ExifTag> nextElement() {
                HashMap<String, ExifTag> map = new HashMap<>();
                for (ExifTag exifTag : ExifData.EXIF_TAGS[this.mIfdIndex]) {
                    map.put(exifTag.name, exifTag);
                }
                this.mIfdIndex++;
                return map;
            }
        });

        Builder(ByteOrder byteOrder) {
            this.mByteOrder = byteOrder;
        }

        private static Pair<Integer, Integer> guessDataFormat(String str) throws NumberFormatException {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strArrSplit[0]);
                if (((Integer) pairGuessDataFormat.first).intValue() != 2) {
                    for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                        Pair<Integer, Integer> pairGuessDataFormat2 = guessDataFormat(strArrSplit[i2]);
                        int iIntValue = (((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.first) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.first)) ? ((Integer) pairGuessDataFormat.first).intValue() : -1;
                        int iIntValue2 = (((Integer) pairGuessDataFormat.second).intValue() == -1 || !(((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.second) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.second))) ? -1 : ((Integer) pairGuessDataFormat.second).intValue();
                        if (iIntValue == -1) {
                            if (iIntValue2 == -1) {
                                return new Pair<>(2, -1);
                            }
                            iIntValue = -1;
                        }
                        if (iIntValue == -1) {
                            pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue2), -1);
                        } else if (iIntValue2 == -1) {
                            pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue), -1);
                        }
                    }
                }
                return pairGuessDataFormat;
            }
            if (!str.contains(DomExceptionUtils.SEPARATOR)) {
                try {
                    try {
                        long j2 = Long.parseLong(str);
                        return (j2 < 0 || j2 > 65535) ? j2 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        Double.parseDouble(str);
                        return new Pair<>(12, -1);
                    }
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            }
            String[] strArrSplit2 = str.split(DomExceptionUtils.SEPARATOR, -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j3 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j4 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j3 >= 0 && j4 >= 0) {
                        if (j3 <= SieveCacheKt.NodeLinkMask && j4 <= SieveCacheKt.NodeLinkMask) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        private void setAttributeIfMissing(String str, String str2, List<Map<String, ExifAttribute>> list) throws NumberFormatException {
            Iterator<Map<String, ExifAttribute>> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().containsKey(str)) {
                    return;
                }
            }
            setAttributeInternal(str, str2, list);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
            	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
            	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
            */
        private void setAttributeInternal(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.utils.ExifAttribute>> r20) throws java.lang.NumberFormatException {
            /*
                Method dump skipped, instructions count: 778
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifData.Builder.setAttributeInternal(java.lang.String, java.lang.String, java.util.List):void");
        }

        public ExifData build() throws NumberFormatException {
            ArrayList list = Collections.list(new Enumeration<Map<String, ExifAttribute>>() { // from class: androidx.camera.core.impl.utils.ExifData.Builder.3
                final Enumeration<Map<String, ExifAttribute>> mMapEnumeration;

                {
                    this.mMapEnumeration = Collections.enumeration(Builder.this.mAttributes);
                }

                @Override // java.util.Enumeration
                public boolean hasMoreElements() {
                    return this.mMapEnumeration.hasMoreElements();
                }

                @Override // java.util.Enumeration
                public Map<String, ExifAttribute> nextElement() {
                    return new HashMap(this.mMapEnumeration.nextElement());
                }
            });
            if (!list.get(1).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_EXPOSURE_PROGRAM, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_EXIF_VERSION, "0230", list);
                setAttributeIfMissing(ExifInterface.TAG_COMPONENTS_CONFIGURATION, ExifData.COMPONENTS_CONFIGURATION_YCBCR, list);
                setAttributeIfMissing(ExifInterface.TAG_METERING_MODE, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_LIGHT_SOURCE, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_FLASHPIX_VERSION, "0100", list);
                setAttributeIfMissing(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, ExifInterface.GPS_MEASUREMENT_2D, list);
                setAttributeIfMissing(ExifInterface.TAG_FILE_SOURCE, ExifInterface.GPS_MEASUREMENT_3D, list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_TYPE, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE, list);
                setAttributeIfMissing(ExifInterface.TAG_CUSTOM_RENDERED, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_SCENE_CAPTURE_TYPE, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_CONTRAST, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_SATURATION, "0", list);
                setAttributeIfMissing(ExifInterface.TAG_SHARPNESS, "0", list);
            }
            if (!list.get(2).isEmpty()) {
                setAttributeIfMissing(ExifInterface.TAG_GPS_VERSION_ID, "2300", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_SPEED_REF, "K", list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_TRACK_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_BEARING_REF, ExifInterface.GPS_DIRECTION_TRUE, list);
                setAttributeIfMissing(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, "K", list);
            }
            return new ExifData(this.mByteOrder, list);
        }

        public Builder removeAttribute(String str) throws NumberFormatException {
            setAttributeInternal(str, null, this.mAttributes);
            return this;
        }

        public Builder setAttribute(String str, String str2) throws NumberFormatException {
            setAttributeInternal(str, str2, this.mAttributes);
            return this;
        }

        public Builder setExposureTimeNanos(long j2) throws NumberFormatException {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            setAttribute(ExifInterface.TAG_EXPOSURE_TIME, String.valueOf(j2 / 1.0E9d));
            return this;
        }

        public Builder setFlashState(CameraCaptureMetaData.FlashState flashState) throws NumberFormatException {
            int i2;
            if (flashState == CameraCaptureMetaData.FlashState.UNKNOWN) {
                return this;
            }
            int iOrdinal = flashState.ordinal();
            if (iOrdinal == 1) {
                i2 = 32;
            } else if (iOrdinal == 2) {
                i2 = 0;
            } else {
                if (iOrdinal != 3) {
                    Objects.toString(flashState);
                    Logger.w(ExifData.TAG, "Unknown flash state: ".concat(String.valueOf(flashState)));
                    return this;
                }
                i2 = 1;
            }
            if ((i2 & 1) == 1) {
                setAttribute(ExifInterface.TAG_LIGHT_SOURCE, "4");
            }
            setAttribute(ExifInterface.TAG_FLASH, String.valueOf(i2));
            return this;
        }

        public Builder setFocalLength(float f2) throws NumberFormatException {
            setAttribute(ExifInterface.TAG_FOCAL_LENGTH, new LongRational((long) (f2 * 1000.0f), 1000L).toString());
            return this;
        }

        public Builder setImageHeight(int i2) throws NumberFormatException {
            setAttribute(ExifInterface.TAG_IMAGE_LENGTH, String.valueOf(i2));
            return this;
        }

        public Builder setImageWidth(int i2) throws NumberFormatException {
            setAttribute(ExifInterface.TAG_IMAGE_WIDTH, String.valueOf(i2));
            return this;
        }

        public Builder setIso(int i2) throws NumberFormatException {
            setAttribute(ExifInterface.TAG_SENSITIVITY_TYPE, ExifInterface.GPS_MEASUREMENT_3D);
            setAttribute(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, String.valueOf(Math.min(65535, i2)));
            return this;
        }

        public Builder setLensFNumber(float f2) throws NumberFormatException {
            setAttribute(ExifInterface.TAG_F_NUMBER, String.valueOf(f2));
            return this;
        }

        public Builder setOrientationDegrees(int i2) throws NumberFormatException {
            int i3;
            if (i2 == 0) {
                i3 = 1;
            } else if (i2 == 90) {
                i3 = 6;
            } else if (i2 == 180) {
                i3 = 3;
            } else if (i2 != 270) {
                Logger.w(ExifData.TAG, "Unexpected orientation value: " + i2 + ". Must be one of 0, 90, 180, 270.");
                i3 = 0;
            } else {
                i3 = 8;
            }
            setAttribute(ExifInterface.TAG_ORIENTATION, String.valueOf(i3));
            return this;
        }

        public Builder setWhiteBalanceMode(WhiteBalanceMode whiteBalanceMode) throws NumberFormatException {
            int iOrdinal = whiteBalanceMode.ordinal();
            setAttribute(ExifInterface.TAG_WHITE_BALANCE, iOrdinal != 0 ? iOrdinal != 1 ? null : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE : "0");
            return this;
        }
    }

    /* compiled from: WazeSource */
    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        ExifTag[] exifTagArr = {new ExifTag(ExifInterface.TAG_IMAGE_WIDTH, 256, 3, 4), new ExifTag(ExifInterface.TAG_IMAGE_LENGTH, 257, 3, 4), new ExifTag(ExifInterface.TAG_MAKE, DisplayStrings.DS_TRIP_OVERVIEW_TTL_LEAVE_NOW, 2), new ExifTag(ExifInterface.TAG_MODEL, DisplayStrings.DS_TRIP_OVERVIEW_TTL_LEAVE_AT_PS_PS, 2), new ExifTag(ExifInterface.TAG_ORIENTATION, DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION, 3), new ExifTag(ExifInterface.TAG_X_RESOLUTION, DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_MESSAGE, 5), new ExifTag(ExifInterface.TAG_Y_RESOLUTION, DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_LINK, 5), new ExifTag(ExifInterface.TAG_RESOLUTION_UNIT, DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CALCULATION_NO_NETWORK_ERROR_DIALOG_TITLE_TEXT, 3), new ExifTag(ExifInterface.TAG_SOFTWARE, 305, 2), new ExifTag(ExifInterface.TAG_DATETIME, 306, 2), new ExifTag(ExifInterface.TAG_Y_CB_CR_POSITIONING, DisplayStrings.DS_REPORT_MENU_V2_CRASH_MAJOR_LABEL, 3), new ExifTag(TAG_SUB_IFD_POINTER, DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_ROUTE_NAME_VIA_FORMAT_PS, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4)};
        IFD_TIFF_TAGS = exifTagArr;
        ExifTag[] exifTagArr2 = {new ExifTag(ExifInterface.TAG_EXPOSURE_TIME, 33434, 5), new ExifTag(ExifInterface.TAG_F_NUMBER, 33437, 5), new ExifTag(ExifInterface.TAG_EXPOSURE_PROGRAM, 34850, 3), new ExifTag(ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new ExifTag(ExifInterface.TAG_SENSITIVITY_TYPE, 34864, 3), new ExifTag(ExifInterface.TAG_EXIF_VERSION, 36864, 2), new ExifTag(ExifInterface.TAG_DATETIME_ORIGINAL, 36867, 2), new ExifTag(ExifInterface.TAG_DATETIME_DIGITIZED, 36868, 2), new ExifTag(ExifInterface.TAG_COMPONENTS_CONFIGURATION, 37121, 7), new ExifTag(ExifInterface.TAG_SHUTTER_SPEED_VALUE, 37377, 10), new ExifTag(ExifInterface.TAG_APERTURE_VALUE, 37378, 5), new ExifTag(ExifInterface.TAG_BRIGHTNESS_VALUE, 37379, 10), new ExifTag(ExifInterface.TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new ExifTag(ExifInterface.TAG_MAX_APERTURE_VALUE, 37381, 5), new ExifTag(ExifInterface.TAG_METERING_MODE, 37383, 3), new ExifTag(ExifInterface.TAG_LIGHT_SOURCE, 37384, 3), new ExifTag(ExifInterface.TAG_FLASH, 37385, 3), new ExifTag(ExifInterface.TAG_FOCAL_LENGTH, 37386, 5), new ExifTag(ExifInterface.TAG_SUBSEC_TIME, 37520, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new ExifTag(ExifInterface.TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new ExifTag(ExifInterface.TAG_FLASHPIX_VERSION, 40960, 7), new ExifTag(ExifInterface.TAG_COLOR_SPACE, 40961, 3), new ExifTag(ExifInterface.TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new ExifTag(ExifInterface.TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new ExifTag(ExifInterface.TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new ExifTag(ExifInterface.TAG_SENSING_METHOD, 41495, 3), new ExifTag(ExifInterface.TAG_FILE_SOURCE, 41728, 7), new ExifTag(ExifInterface.TAG_SCENE_TYPE, 41729, 7), new ExifTag(ExifInterface.TAG_CUSTOM_RENDERED, 41985, 3), new ExifTag(ExifInterface.TAG_EXPOSURE_MODE, 41986, 3), new ExifTag(ExifInterface.TAG_WHITE_BALANCE, 41987, 3), new ExifTag(ExifInterface.TAG_SCENE_CAPTURE_TYPE, 41990, 3), new ExifTag(ExifInterface.TAG_CONTRAST, 41992, 3), new ExifTag(ExifInterface.TAG_SATURATION, 41993, 3), new ExifTag(ExifInterface.TAG_SHARPNESS, 41994, 3)};
        IFD_EXIF_TAGS = exifTagArr2;
        ExifTag[] exifTagArr3 = {new ExifTag(ExifInterface.TAG_GPS_VERSION_ID, 0, 1), new ExifTag(ExifInterface.TAG_GPS_LATITUDE_REF, 1, 2), new ExifTag(ExifInterface.TAG_GPS_LATITUDE, 2, 5, 10), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE_REF, 3, 2), new ExifTag(ExifInterface.TAG_GPS_LONGITUDE, 4, 5, 10), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE_REF, 5, 1), new ExifTag(ExifInterface.TAG_GPS_ALTITUDE, 6, 5), new ExifTag(ExifInterface.TAG_GPS_TIMESTAMP, 7, 5), new ExifTag(ExifInterface.TAG_GPS_SPEED_REF, 12, 2), new ExifTag(ExifInterface.TAG_GPS_TRACK_REF, 14, 2), new ExifTag(ExifInterface.TAG_GPS_IMG_DIRECTION_REF, 16, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_BEARING_REF, 23, 2), new ExifTag(ExifInterface.TAG_GPS_DEST_DISTANCE_REF, 25, 2)};
        IFD_GPS_TAGS = exifTagArr3;
        EXIF_POINTER_TAGS = new ExifTag[]{new ExifTag(TAG_SUB_IFD_POINTER, DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_ROUTE_NAME_VIA_FORMAT_PS, 4), new ExifTag(TAG_EXIF_IFD_POINTER, 34665, 4), new ExifTag(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new ExifTag(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4)};
        ExifTag[] exifTagArr4 = {new ExifTag(ExifInterface.TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = exifTagArr4;
        EXIF_TAGS = new ExifTag[][]{exifTagArr, exifTagArr2, exifTagArr3, exifTagArr4};
        sTagSetForCompatibility = new HashSet<>(Arrays.asList(ExifInterface.TAG_F_NUMBER, ExifInterface.TAG_EXPOSURE_TIME, ExifInterface.TAG_GPS_TIMESTAMP));
        COMPONENTS_CONFIGURATION_YCBCR = new String(new byte[]{1, 2, 3, 0}, StandardCharsets.UTF_8);
    }

    ExifData(ByteOrder byteOrder, List<Map<String, ExifAttribute>> list) {
        Preconditions.checkState(list.size() == EXIF_TAGS.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.mByteOrder = byteOrder;
        this.mAttributes = list;
    }

    public static Builder builderForDevice() throws NumberFormatException {
        Builder builder = new Builder(ByteOrder.BIG_ENDIAN);
        builder.setAttribute(ExifInterface.TAG_ORIENTATION, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        builder.setAttribute(ExifInterface.TAG_X_RESOLUTION, "72/1");
        builder.setAttribute(ExifInterface.TAG_Y_RESOLUTION, "72/1");
        builder.setAttribute(ExifInterface.TAG_RESOLUTION_UNIT, ExifInterface.GPS_MEASUREMENT_2D);
        builder.setAttribute(ExifInterface.TAG_Y_CB_CR_POSITIONING, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        builder.setAttribute(ExifInterface.TAG_MAKE, Build.MANUFACTURER);
        builder.setAttribute(ExifInterface.TAG_MODEL, Build.MODEL);
        return builder;
    }

    public static ExifData create(ImageProxy imageProxy, int i2) throws NumberFormatException {
        Builder builderBuilderForDevice = builderForDevice();
        if (imageProxy.getImageInfo() != null) {
            imageProxy.getImageInfo().populateExifData(builderBuilderForDevice);
        }
        builderBuilderForDevice.setOrientationDegrees(i2);
        builderBuilderForDevice.setImageWidth(imageProxy.getWidth());
        builderBuilderForDevice.setImageHeight(imageProxy.getHeight());
        return builderBuilderForDevice.build();
    }

    private ExifAttribute getExifAttribute(String str) {
        for (int i2 = 0; i2 < EXIF_TAGS.length; i2++) {
            ExifAttribute exifAttribute = this.mAttributes.get(i2).get(true != ExifInterface.TAG_ISO_SPEED_RATINGS.equals(str) ? str : ExifInterface.TAG_PHOTOGRAPHIC_SENSITIVITY);
            if (exifAttribute != null) {
                return exifAttribute;
            }
        }
        return null;
    }

    public String getAttribute(String str) {
        ExifAttribute exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.getStringValue(this.mByteOrder);
            }
            if (str.equals(ExifInterface.TAG_GPS_TIMESTAMP)) {
                int i2 = exifAttribute.format;
                if (i2 != 5 && i2 != 10) {
                    Logger.w(TAG, "GPS Timestamp format is not rational. format=" + exifAttribute.format);
                    return null;
                }
                LongRational[] longRationalArr = (LongRational[]) exifAttribute.getValue(this.mByteOrder);
                if (longRationalArr != null && longRationalArr.length == 3) {
                    return String.format(Locale.US, "%02d:%02d:%02d", Integer.valueOf((int) (longRationalArr[0].getNumerator() / longRationalArr[0].getDenominator())), Integer.valueOf((int) (longRationalArr[1].getNumerator() / longRationalArr[1].getDenominator())), Integer.valueOf((int) (longRationalArr[2].getNumerator() / longRationalArr[2].getDenominator())));
                }
                Logger.w(TAG, "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(longRationalArr))));
                return null;
            }
            try {
                return Double.toString(exifAttribute.getDoubleValue(this.mByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    Map<String, ExifAttribute> getAttributes(int i2) {
        Preconditions.checkArgumentInRange(i2, 0, EXIF_TAGS.length, "Invalid IFD index: " + i2 + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.mAttributes.get(i2);
    }

    public ByteOrder getByteOrder() {
        return this.mByteOrder;
    }
}
