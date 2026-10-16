package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.UriUtil;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.d.b.an;
import com.google.d.b.w;
import com.google.d.d.ab;
import com.google.d.d.bn;
import com.google.d.d.bo;
import com.google.d.d.bq;
import com.google.d.d.fu;
import j$.util.Objects;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class CmcdData {
    private static final w COMMA_JOINER = w.b(",");
    public static final String OBJECT_TYPE_AUDIO_ONLY = "a";
    public static final String OBJECT_TYPE_INIT_SEGMENT = "i";
    public static final String OBJECT_TYPE_MANIFEST = "m";
    public static final String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
    public static final String OBJECT_TYPE_VIDEO_ONLY = "v";
    public static final String STREAMING_FORMAT_DASH = "d";
    public static final String STREAMING_FORMAT_HLS = "h";
    public static final String STREAMING_FORMAT_SS = "s";
    public static final String STREAM_TYPE_LIVE = "l";
    public static final String STREAM_TYPE_VOD = "v";
    private final CmcdObject cmcdObject;
    private final CmcdRequest cmcdRequest;
    private final CmcdSession cmcdSession;
    private final CmcdStatus cmcdStatus;
    private final int dataTransmissionMode;

    /* compiled from: WazeSource */
    final class CmcdObject {
        public final int bitrateKbps;
        public final bn<String> customDataList;
        public final long objectDurationMs;
        public final String objectType;
        public final int topBitrateKbps;

        /* compiled from: WazeSource */
        public final class Builder {
            private String objectType;
            private int bitrateKbps = C.RATE_UNSET_INT;
            private int topBitrateKbps = C.RATE_UNSET_INT;
            private long objectDurationMs = C.TIME_UNSET;
            private bn<String> customDataList = bn.p();

            public CmcdObject build() {
                return new CmcdObject(this);
            }

            public Builder setBitrateKbps(int i2) {
                boolean z = true;
                if (i2 < 0) {
                    if (i2 == -2147483647) {
                        i2 = -2147483647;
                    } else {
                        z = false;
                    }
                }
                an.l(z);
                this.bitrateKbps = i2;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = bn.n(list);
                return this;
            }

            public Builder setObjectDurationMs(long j2) {
                boolean z = true;
                if (j2 < 0) {
                    if (j2 == C.TIME_UNSET) {
                        j2 = -9223372036854775807L;
                    } else {
                        z = false;
                    }
                }
                an.l(z);
                this.objectDurationMs = j2;
                return this;
            }

            public Builder setObjectType(String str) {
                this.objectType = str;
                return this;
            }

            public Builder setTopBitrateKbps(int i2) {
                boolean z = true;
                if (i2 < 0) {
                    if (i2 == -2147483647) {
                        i2 = -2147483647;
                    } else {
                        z = false;
                    }
                }
                an.l(z);
                this.topBitrateKbps = i2;
                return this;
            }
        }

        private CmcdObject(Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ab<String, String> abVar) {
            ArrayList arrayList = new ArrayList();
            int i2 = this.bitrateKbps;
            if (i2 != -2147483647) {
                arrayList.add("br=" + i2);
            }
            int i3 = this.topBitrateKbps;
            if (i3 != -2147483647) {
                arrayList.add("tb=" + i3);
            }
            long j2 = this.objectDurationMs;
            if (j2 != C.TIME_UNSET) {
                arrayList.add("d=" + j2);
            }
            if (!TextUtils.isEmpty(this.objectType)) {
                arrayList.add("ot=".concat(String.valueOf(this.objectType)));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            abVar.H(CmcdConfiguration.KEY_CMCD_OBJECT, arrayList);
        }
    }

    /* compiled from: WazeSource */
    final class CmcdRequest {
        public final long bufferLengthMs;
        public final bn<String> customDataList;
        public final long deadlineMs;
        public final long measuredThroughputInKbps;
        public final String nextObjectRequest;
        public final String nextRangeRequest;
        public final boolean startup;

        /* compiled from: WazeSource */
        public final class Builder {
            private String nextObjectRequest;
            private String nextRangeRequest;
            private boolean startup;
            private long bufferLengthMs = C.TIME_UNSET;
            private long measuredThroughputInKbps = -2147483647L;
            private long deadlineMs = C.TIME_UNSET;
            private bn<String> customDataList = bn.p();

            public CmcdRequest build() {
                return new CmcdRequest(this);
            }

            public Builder setBufferLengthMs(long j2) {
                if (j2 == C.TIME_UNSET) {
                    this.bufferLengthMs = C.TIME_UNSET;
                    return this;
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException();
                }
                this.bufferLengthMs = ((j2 + 50) / 100) * 100;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = bn.n(list);
                return this;
            }

            public Builder setDeadlineMs(long j2) {
                if (j2 == C.TIME_UNSET) {
                    this.deadlineMs = C.TIME_UNSET;
                    return this;
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException();
                }
                this.deadlineMs = ((j2 + 50) / 100) * 100;
                return this;
            }

            public Builder setMeasuredThroughputInKbps(long j2) {
                if (j2 == -2147483647L) {
                    this.measuredThroughputInKbps = -2147483647L;
                    return this;
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException();
                }
                this.measuredThroughputInKbps = ((j2 + 50) / 100) * 100;
                return this;
            }

            public Builder setNextObjectRequest(String str) {
                this.nextObjectRequest = str == null ? null : Uri.encode(str);
                return this;
            }

            public Builder setNextRangeRequest(String str) {
                this.nextRangeRequest = str;
                return this;
            }

            public Builder setStartup(boolean z) {
                this.startup = z;
                return this;
            }
        }

        private CmcdRequest(Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.deadlineMs = builder.deadlineMs;
            this.startup = builder.startup;
            this.nextObjectRequest = builder.nextObjectRequest;
            this.nextRangeRequest = builder.nextRangeRequest;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ab<String, String> abVar) {
            ArrayList arrayList = new ArrayList();
            long j2 = this.bufferLengthMs;
            if (j2 != C.TIME_UNSET) {
                arrayList.add("bl=" + j2);
            }
            long j3 = this.measuredThroughputInKbps;
            if (j3 != -2147483647L) {
                arrayList.add("mtp=" + j3);
            }
            long j4 = this.deadlineMs;
            if (j4 != C.TIME_UNSET) {
                arrayList.add("dl=" + j4);
            }
            if (this.startup) {
                arrayList.add(CmcdConfiguration.KEY_STARTUP);
            }
            if (!TextUtils.isEmpty(this.nextObjectRequest)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_NEXT_OBJECT_REQUEST, this.nextObjectRequest));
            }
            if (!TextUtils.isEmpty(this.nextRangeRequest)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_NEXT_RANGE_REQUEST, this.nextRangeRequest));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            abVar.H(CmcdConfiguration.KEY_CMCD_REQUEST, arrayList);
        }
    }

    /* compiled from: WazeSource */
    final class CmcdSession {
        public static final int VERSION = 1;
        public final String contentId;
        public final bn<String> customDataList;
        public final float playbackRate;
        public final String sessionId;
        public final String streamType;
        public final String streamingFormat;

        /* compiled from: WazeSource */
        public final class Builder {
            private String contentId;
            private String sessionId;
            private String streamType;
            private String streamingFormat;
            private float playbackRate = -3.4028235E38f;
            private bn<String> customDataList = bn.p();

            public CmcdSession build() {
                return new CmcdSession(this);
            }

            public Builder setContentId(String str) {
                boolean z = true;
                if (str != null && str.length() > 64) {
                    z = false;
                }
                an.l(z);
                this.contentId = str;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = bn.n(list);
                return this;
            }

            public Builder setPlaybackRate(float f2) {
                boolean z = true;
                if (f2 <= 0.0f && f2 != -3.4028235E38f) {
                    z = false;
                }
                an.l(z);
                this.playbackRate = f2;
                return this;
            }

            public Builder setSessionId(String str) {
                boolean z = true;
                if (str != null && str.length() > 64) {
                    z = false;
                }
                an.l(z);
                this.sessionId = str;
                return this;
            }

            public Builder setStreamType(String str) {
                this.streamType = str;
                return this;
            }

            public Builder setStreamingFormat(String str) {
                this.streamingFormat = str;
                return this;
            }
        }

        private CmcdSession(Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.playbackRate = builder.playbackRate;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ab<String, String> abVar) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.contentId)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_CONTENT_ID, this.contentId));
            }
            if (!TextUtils.isEmpty(this.sessionId)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_SESSION_ID, this.sessionId));
            }
            if (!TextUtils.isEmpty(this.streamingFormat)) {
                arrayList.add("sf=".concat(String.valueOf(this.streamingFormat)));
            }
            if (!TextUtils.isEmpty(this.streamType)) {
                arrayList.add("st=".concat(String.valueOf(this.streamType)));
            }
            float f2 = this.playbackRate;
            if (f2 != -3.4028235E38f && f2 != 1.0f) {
                arrayList.add(Util.formatInvariant("%s=%.2f", CmcdConfiguration.KEY_PLAYBACK_RATE, Float.valueOf(f2)));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            abVar.H(CmcdConfiguration.KEY_CMCD_SESSION, arrayList);
        }
    }

    /* compiled from: WazeSource */
    final class CmcdStatus {
        public final boolean bufferStarvation;
        public final bn<String> customDataList;
        public final int maximumRequestedThroughputKbps;

        /* compiled from: WazeSource */
        public final class Builder {
            private boolean bufferStarvation;
            private int maximumRequestedThroughputKbps = C.RATE_UNSET_INT;
            private bn<String> customDataList = bn.p();

            public CmcdStatus build() {
                return new CmcdStatus(this);
            }

            public Builder setBufferStarvation(boolean z) {
                this.bufferStarvation = z;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = bn.n(list);
                return this;
            }

            public Builder setMaximumRequestedThroughputKbps(int i2) {
                boolean z = true;
                if (i2 < 0) {
                    if (i2 == -2147483647) {
                        i2 = -2147483647;
                    } else {
                        z = false;
                    }
                }
                an.l(z);
                if (i2 != -2147483647) {
                    i2 = ((i2 + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i2;
                return this;
            }
        }

        private CmcdStatus(Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.bufferStarvation = builder.bufferStarvation;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(ab<String, String> abVar) {
            ArrayList arrayList = new ArrayList();
            int i2 = this.maximumRequestedThroughputKbps;
            if (i2 != -2147483647) {
                arrayList.add("rtp=" + i2);
            }
            if (this.bufferStarvation) {
                arrayList.add(CmcdConfiguration.KEY_BUFFER_STARVATION);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            abVar.H(CmcdConfiguration.KEY_CMCD_STATUS, arrayList);
        }
    }

    /* compiled from: WazeSource */
    public final class Factory {
        private static final Pattern CUSTOM_KEY_NAME_PATTERN = Pattern.compile(".*-.*");
        private final CmcdConfiguration cmcdConfiguration;
        private boolean didRebuffer;
        private boolean isBufferEmpty;
        private Boolean isLive;
        private String nextObjectRequest;
        private String nextRangeRequest;
        private String objectType;
        private final String streamingFormat;
        private ExoTrackSelection trackSelection;
        private long bufferedDurationUs = C.TIME_UNSET;
        private float playbackRate = -3.4028235E38f;
        private long chunkDurationUs = C.TIME_UNSET;

        public Factory(CmcdConfiguration cmcdConfiguration, String str) {
            this.cmcdConfiguration = cmcdConfiguration;
            this.streamingFormat = str;
        }

        private static String getObjectTypeFromFormat(Format format) {
            String audioMediaMimeType = MimeTypes.getAudioMediaMimeType(format.codecs);
            String videoMediaMimeType = MimeTypes.getVideoMediaMimeType(format.codecs);
            if (audioMediaMimeType != null && videoMediaMimeType != null) {
                return CmcdData.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO;
            }
            int trackType = MimeTypes.getTrackType(format.sampleMimeType);
            if (trackType == -1) {
                trackType = MimeTypes.getTrackType(format.containerMimeType);
            }
            if (trackType == 1) {
                return CmcdData.OBJECT_TYPE_AUDIO_ONLY;
            }
            if (trackType == 2) {
                return "v";
            }
            return null;
        }

        private static boolean isManifestObjectType(String str) {
            return Objects.equals(str, CmcdData.OBJECT_TYPE_MANIFEST);
        }

        private static boolean isMediaObjectType(String str) {
            return Objects.equals(str, CmcdData.OBJECT_TYPE_AUDIO_ONLY) || Objects.equals(str, "v") || Objects.equals(str, CmcdData.OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO);
        }

        private void validateCustomDataListFormat(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                an.u(CUSTOM_KEY_NAME_PATTERN.matcher(Util.split(it.next(), "=")[0]).matches());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CmcdData createCmcdData() {
            int iCeilDivide;
            int requestedMaximumThroughputKbps;
            int iCeilDivide2;
            boolean zIsManifestObjectType = isManifestObjectType(this.objectType);
            if (!zIsManifestObjectType) {
                an.C(this.trackSelection, "Track selection must be set");
            }
            String objectTypeFromFormat = this.objectType;
            if (objectTypeFromFormat == null) {
                ExoTrackSelection exoTrackSelection = this.trackSelection;
                an.B(exoTrackSelection);
                objectTypeFromFormat = getObjectTypeFromFormat(exoTrackSelection.getSelectedFormat());
                this.objectType = objectTypeFromFormat;
            }
            boolean zIsMediaObjectType = isMediaObjectType(objectTypeFromFormat);
            if (zIsMediaObjectType) {
                an.v(this.bufferedDurationUs != C.TIME_UNSET, "Buffered duration must be set");
                an.v(this.chunkDurationUs != C.TIME_UNSET, "Chunk duration must be set");
            }
            bo<String, String> customData = this.cmcdConfiguration.requestConfig.getCustomData();
            fu fuVarListIterator = customData.C().listIterator();
            while (fuVarListIterator.hasNext()) {
                validateCustomDataListFormat(customData.c((String) fuVarListIterator.next()));
            }
            if (zIsManifestObjectType) {
                iCeilDivide = C.RATE_UNSET_INT;
                requestedMaximumThroughputKbps = -2147483647;
                iCeilDivide2 = -2147483647;
            } else {
                ExoTrackSelection exoTrackSelection2 = this.trackSelection;
                an.B(exoTrackSelection2);
                int iMax = exoTrackSelection2.getSelectedFormat().bitrate;
                iCeilDivide = Util.ceilDivide(iMax, 1000);
                TrackGroup trackGroup = exoTrackSelection2.getTrackGroup();
                for (int i2 = 0; i2 < trackGroup.length; i2++) {
                    iMax = Math.max(iMax, trackGroup.getFormat(i2).bitrate);
                }
                iCeilDivide2 = Util.ceilDivide(iMax, 1000);
                jCeilDivide = exoTrackSelection2.getLatestBitrateEstimate() != -2147483647L ? Util.ceilDivide(exoTrackSelection2.getLatestBitrateEstimate(), 1000L) : -2147483647L;
                requestedMaximumThroughputKbps = this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(iCeilDivide);
            }
            CmcdObject.Builder builder = new CmcdObject.Builder();
            if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                builder.setBitrateKbps(iCeilDivide);
            }
            if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                builder.setTopBitrateKbps(iCeilDivide2);
            }
            if (zIsMediaObjectType && this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                builder.setObjectDurationMs(Util.usToMs(this.chunkDurationUs));
            }
            if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
                builder.setObjectType(this.objectType);
            }
            if (customData.h(CmcdConfiguration.KEY_CMCD_OBJECT)) {
                builder.setCustomDataList(customData.c(CmcdConfiguration.KEY_CMCD_OBJECT));
            }
            CmcdRequest.Builder builder2 = new CmcdRequest.Builder();
            if (zIsMediaObjectType) {
                if (this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
                    builder2.setBufferLengthMs(Util.usToMs(this.bufferedDurationUs));
                }
                if (this.cmcdConfiguration.isDeadlineLoggingAllowed()) {
                    builder2.setDeadlineMs(Util.usToMs((long) (this.bufferedDurationUs / this.playbackRate)));
                }
            }
            if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed()) {
                builder2.setMeasuredThroughputInKbps(jCeilDivide);
            }
            if (this.cmcdConfiguration.isStartupLoggingAllowed()) {
                builder2.setStartup(this.didRebuffer || this.isBufferEmpty);
            }
            if (this.cmcdConfiguration.isNextObjectRequestLoggingAllowed()) {
                builder2.setNextObjectRequest(this.nextObjectRequest);
            }
            if (this.cmcdConfiguration.isNextRangeRequestLoggingAllowed()) {
                builder2.setNextRangeRequest(this.nextRangeRequest);
            }
            if (customData.h(CmcdConfiguration.KEY_CMCD_REQUEST)) {
                builder2.setCustomDataList(customData.c(CmcdConfiguration.KEY_CMCD_REQUEST));
            }
            CmcdSession.Builder builder3 = new CmcdSession.Builder();
            if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
                builder3.setContentId(this.cmcdConfiguration.contentId);
            }
            if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
                builder3.setSessionId(this.cmcdConfiguration.sessionId);
            }
            if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
                builder3.setStreamingFormat(this.streamingFormat);
            }
            if (this.isLive != null && this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
                Boolean bool = this.isLive;
                an.B(bool);
                builder3.setStreamType(true != bool.booleanValue() ? "v" : CmcdData.STREAM_TYPE_LIVE);
            }
            if (this.cmcdConfiguration.isPlaybackRateLoggingAllowed()) {
                builder3.setPlaybackRate(this.playbackRate);
            }
            if (customData.h(CmcdConfiguration.KEY_CMCD_SESSION)) {
                builder3.setCustomDataList(customData.c(CmcdConfiguration.KEY_CMCD_SESSION));
            }
            CmcdStatus.Builder builder4 = new CmcdStatus.Builder();
            if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
                builder4.setMaximumRequestedThroughputKbps(requestedMaximumThroughputKbps);
            }
            if (this.cmcdConfiguration.isBufferStarvationLoggingAllowed()) {
                builder4.setBufferStarvation(this.didRebuffer);
            }
            if (customData.h(CmcdConfiguration.KEY_CMCD_STATUS)) {
                builder4.setCustomDataList(customData.c(CmcdConfiguration.KEY_CMCD_STATUS));
            }
            return new CmcdData(builder.build(), builder2.build(), builder3.build(), builder4.build(), this.cmcdConfiguration.dataTransmissionMode);
        }

        public Factory setBufferedDurationUs(long j2) {
            an.l(j2 >= 0);
            this.bufferedDurationUs = j2;
            return this;
        }

        public Factory setChunkDurationUs(long j2) {
            an.l(j2 >= 0);
            this.chunkDurationUs = j2;
            return this;
        }

        public Factory setDidRebuffer(boolean z) {
            this.didRebuffer = z;
            return this;
        }

        public Factory setIsBufferEmpty(boolean z) {
            this.isBufferEmpty = z;
            return this;
        }

        public Factory setIsLive(boolean z) {
            this.isLive = Boolean.valueOf(z);
            return this;
        }

        public Factory setNextObjectRequest(String str) {
            this.nextObjectRequest = str;
            return this;
        }

        public Factory setNextRangeRequest(String str) {
            this.nextRangeRequest = str;
            return this;
        }

        public Factory setObjectType(String str) {
            this.objectType = str;
            return this;
        }

        public Factory setPlaybackRate(float f2) {
            boolean z = true;
            if (f2 != -3.4028235E38f && f2 <= 0.0f) {
                z = false;
            }
            an.l(z);
            this.playbackRate = f2;
            return this;
        }

        public Factory setTrackSelection(ExoTrackSelection exoTrackSelection) {
            this.trackSelection = exoTrackSelection;
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    private CmcdData(CmcdObject cmcdObject, CmcdRequest cmcdRequest, CmcdSession cmcdSession, CmcdStatus cmcdStatus, int i2) {
        this.cmcdObject = cmcdObject;
        this.cmcdRequest = cmcdRequest;
        this.cmcdSession = cmcdSession;
        this.cmcdStatus = cmcdStatus;
        this.dataTransmissionMode = i2;
    }

    public static DataSpec removeFromDataSpec(DataSpec dataSpec) {
        Uri uriRemoveFromUri = removeFromUri(dataSpec.uri);
        if (!Objects.equals(uriRemoveFromUri, dataSpec.uri)) {
            dataSpec = dataSpec.withUri(uriRemoveFromUri);
        }
        if (!dataSpec.httpRequestHeaders.containsKey(CmcdConfiguration.KEY_CMCD_OBJECT) && !dataSpec.httpRequestHeaders.containsKey(CmcdConfiguration.KEY_CMCD_REQUEST) && !dataSpec.httpRequestHeaders.containsKey(CmcdConfiguration.KEY_CMCD_STATUS) && !dataSpec.httpRequestHeaders.containsKey(CmcdConfiguration.KEY_CMCD_SESSION)) {
            return dataSpec;
        }
        bq bqVar = new bq();
        for (Map.Entry<String, String> entry : dataSpec.httpRequestHeaders.entrySet()) {
            if (!entry.getKey().equals(CmcdConfiguration.KEY_CMCD_OBJECT) && !entry.getKey().equals(CmcdConfiguration.KEY_CMCD_REQUEST) && !entry.getKey().equals(CmcdConfiguration.KEY_CMCD_STATUS) && !entry.getKey().equals(CmcdConfiguration.KEY_CMCD_SESSION)) {
                bqVar.c(entry);
            }
        }
        return dataSpec.withRequestHeaders(bqVar.b());
    }

    public static Uri removeFromUri(Uri uri) {
        return (!uri.isHierarchical() || uri.getQueryParameter(CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY) == null) ? uri : UriUtil.removeQueryParameter(uri, CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY);
    }

    public DataSpec addToDataSpec(DataSpec dataSpec) {
        CmcdObject cmcdObject = this.cmcdObject;
        ab<String, String> abVarI = ab.I();
        cmcdObject.populateCmcdDataMap(abVarI);
        this.cmcdRequest.populateCmcdDataMap(abVarI);
        this.cmcdSession.populateCmcdDataMap(abVarI);
        this.cmcdStatus.populateCmcdDataMap(abVarI);
        if (this.dataTransmissionMode == 0) {
            bq bqVar = new bq();
            for (String str : abVarI.C()) {
                List listG = abVarI.g(str);
                Collections.sort(listG);
                bqVar.d(str, COMMA_JOINER.d(listG));
            }
            return dataSpec.withAdditionalHeaders(bqVar.b());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = abVarI.B().values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((Collection) it.next());
        }
        Collections.sort(arrayList);
        Uri.Builder builderAppendQueryParameter = dataSpec.uri.buildUpon().appendQueryParameter(CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY, COMMA_JOINER.d(arrayList));
        DataSpec.Builder builderBuildUpon = dataSpec.buildUpon();
        builderBuildUpon.setUri(builderAppendQueryParameter.build());
        return builderBuildUpon.build();
    }
}
