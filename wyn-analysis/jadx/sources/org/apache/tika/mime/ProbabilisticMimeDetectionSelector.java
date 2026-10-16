package org.apache.tika.mime;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.apache.tika.detect.Detector;

/* loaded from: classes5.dex */
public class ProbabilisticMimeDetectionSelector implements Detector {
    private static final float DEFAULT_EXTENSION_TRUST = 0.8f;
    private static final float DEFAULT_MAGIC_TRUST = 0.9f;
    private static final float DEFAULT_META_TRUST = 0.8f;
    private static final long serialVersionUID = 224589862960269260L;
    private final float changeRate;
    private float extension_neg;
    private float extension_trust;
    private float magic_neg;
    private float magic_trust;
    private float meta_neg;
    private float meta_trust;
    private final MimeTypes mimeTypes;
    private float priorExtensionFileType;
    private float priorMagicFileType;
    private float priorMetaFileType;
    private final MediaType rootMediaType;
    private float threshold;

    public static class Builder {
        private float extension_neg;
        private float extension_trust;
        private float magic_neg;
        private float magic_trust;
        private float meta_neg;
        private float meta_trust;
        private float priorExtensionFileType;
        private float priorMagicFileType;
        private float priorMetaFileType;
        private float threshold;

        public ProbabilisticMimeDetectionSelector build2() {
            return new ProbabilisticMimeDetectionSelector(this);
        }

        public synchronized Builder extension_neg(float f10) {
            this.extension_neg = f10;
            return this;
        }

        public synchronized Builder extension_trust(float f10) {
            this.extension_trust = f10;
            return this;
        }

        public synchronized Builder magic_neg(float f10) {
            this.magic_neg = f10;
            return this;
        }

        public synchronized Builder magic_trust(float f10) {
            this.magic_trust = f10;
            return this;
        }

        public synchronized Builder meta_neg(float f10) {
            this.meta_neg = f10;
            return this;
        }

        public synchronized Builder meta_trust(float f10) {
            this.meta_trust = f10;
            return this;
        }

        public synchronized Builder priorExtensionFileType(float f10) {
            this.priorExtensionFileType = f10;
            return this;
        }

        public synchronized Builder priorMagicFileType(float f10) {
            this.priorMagicFileType = f10;
            return this;
        }

        public synchronized Builder priorMetaFileType(float f10) {
            this.priorMetaFileType = f10;
            return this;
        }

        public synchronized Builder threshold(float f10) {
            this.threshold = f10;
            return this;
        }
    }

    public ProbabilisticMimeDetectionSelector() {
        this(MimeTypes.getDefaultMimeTypes(), null);
    }

    private MediaType applyProbilities(List<MimeType> list, MimeType mimeType, MimeType mimeType2) {
        MediaType mediaType;
        float[] fArr;
        List<MimeType> list2 = list;
        MimeType mimeType3 = mimeType;
        MediaType type = mimeType3 == null ? null : mimeType3.getType();
        MediaType type2 = mimeType2 != null ? mimeType2.getType() : null;
        int size = list2.size();
        float f10 = this.magic_trust;
        float f11 = this.magic_neg;
        float f12 = this.extension_trust;
        float f13 = this.extension_neg;
        float f14 = this.meta_trust;
        float f15 = this.meta_neg;
        if (type == null || type.compareTo(this.rootMediaType) == 0) {
            f12 = 1.0f;
            f13 = 1.0f;
        }
        if (type2 == null || type2.compareTo(this.rootMediaType) == 0) {
            f14 = 1.0f;
            f15 = 1.0f;
        }
        MediaType mediaType2 = this.rootMediaType;
        float f16 = -1.0f;
        if (!list2.isEmpty()) {
            int i5 = 0;
            MediaType mediaType3 = type2;
            while (i5 < size) {
                MediaType type3 = list2.get(i5).getType();
                int i10 = size;
                MediaTypeRegistry mediaTypeRegistry = this.mimeTypes.getMediaTypeRegistry();
                float f17 = f10;
                if (type3 == null || !type3.equals(this.rootMediaType)) {
                    if (type != null) {
                        if (type.equals(type3) || mediaTypeRegistry.isSpecializationOf(type, type3)) {
                            list2.set(i5, mimeType3);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, type)) {
                            type = type3;
                        }
                    }
                    if (mediaType3 != null) {
                        if (mediaType3.equals(type3) || mediaTypeRegistry.isSpecializationOf(mediaType3, type3)) {
                            list2.set(i5, mimeType2);
                        } else if (mediaTypeRegistry.isSpecializationOf(type3, mediaType3)) {
                            mediaType3 = type3;
                        }
                    }
                    f10 = f17;
                    mediaType = mediaType3;
                } else {
                    f10 = 1.0f;
                    f11 = 1.0f;
                    mediaType = mediaType3;
                }
                float[] fArr2 = new float[3];
                float[] fArr3 = new float[3];
                float[] fArr4 = new float[3];
                MediaType type4 = list2.get(i5).getType();
                if (i5 > 0) {
                    float f18 = this.changeRate;
                    f11 = (f18 + 1.0f) * f11;
                    f10 = (1.0f - f18) * f10;
                }
                if (type4 == null || f10 == 1.0f) {
                    fArr2[0] = 0.1f;
                } else {
                    fArr3[0] = f10;
                    fArr4[0] = f11;
                    if (mediaType == null || f14 == 1.0f) {
                        fArr3[1] = 1.0f;
                        fArr4[1] = 1.0f;
                    } else if (type4.equals(mediaType)) {
                        fArr3[1] = f14;
                        fArr4[1] = f15;
                    } else {
                        fArr3[1] = 1.0f - f14;
                        fArr4[1] = 1.0f - f15;
                    }
                    if (type == null || f12 == 1.0f) {
                        fArr3[2] = 1.0f;
                        fArr4[2] = 1.0f;
                    } else if (type4.equals(type)) {
                        fArr3[2] = f12;
                        fArr4[2] = f13;
                    } else {
                        fArr3[2] = 1.0f - f12;
                        fArr4[2] = 1.0f - f13;
                    }
                }
                float[] fArr5 = new float[3];
                float[] fArr6 = new float[3];
                if (mimeType2 == null || f14 == 1.0f) {
                    fArr2[1] = 0.1f;
                } else {
                    fArr5[1] = f14;
                    fArr6[1] = f15;
                    if (type4 == null || f10 == 1.0f) {
                        fArr5[0] = 1.0f;
                        fArr6[0] = 1.0f;
                    } else if (mediaType.equals(type4)) {
                        fArr5[0] = f10;
                        fArr6[0] = f11;
                    } else {
                        fArr5[0] = 1.0f - f10;
                        fArr6[0] = 1.0f - f11;
                    }
                    if (type == null || f12 == 1.0f) {
                        fArr5[2] = 1.0f;
                        fArr6[2] = 1.0f;
                    } else if (mediaType.equals(type)) {
                        fArr5[2] = f12;
                        fArr6[2] = f13;
                    } else {
                        fArr5[2] = 1.0f - f12;
                        fArr6[2] = 1.0f - f13;
                    }
                }
                float[] fArr7 = new float[3];
                float[] fArr8 = new float[3];
                if (type == null || f12 == 1.0f) {
                    fArr2[2] = 0.1f;
                } else {
                    fArr7[2] = f12;
                    fArr8[2] = f13;
                    if (type4 == null || f10 == 1.0f) {
                        fArr7[0] = 1.0f;
                        fArr8[0] = 1.0f;
                    } else if (type4.equals(type)) {
                        fArr7[0] = f10;
                        fArr8[0] = f11;
                    } else {
                        fArr7[0] = 1.0f - f10;
                        fArr8[0] = 1.0f - f11;
                    }
                    if (mediaType == null || f14 == 1.0f) {
                        fArr7[1] = 1.0f;
                        fArr8[1] = 1.0f;
                    } else if (mediaType.equals(type)) {
                        fArr7[1] = f14;
                        fArr8[1] = f15;
                    } else {
                        fArr7[1] = 1.0f - f14;
                        fArr8[1] = 1.0f - f15;
                    }
                }
                float f19 = this.priorMagicFileType;
                float f20 = 1.0f - f19;
                if (fArr2[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f21 = f19;
                    fArr = fArr8;
                    for (int i11 = 0; i11 < 3; i11++) {
                        float f22 = fArr3[i11];
                        f21 *= f22;
                        if (f22 != 1.0f) {
                            f20 *= fArr4[i11];
                        }
                    }
                    fArr2[0] = f21 / (f21 + f20);
                } else {
                    fArr = fArr8;
                }
                float f23 = fArr2[0];
                if (f16 < f23) {
                    f16 = f23;
                    mediaType2 = type4;
                }
                float f24 = this.priorMetaFileType;
                float f25 = 1.0f - f24;
                if (fArr2[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f26 = f24;
                    for (int i12 = 0; i12 < 3; i12++) {
                        float f27 = fArr5[i12];
                        f26 *= f27;
                        if (f27 != 1.0f) {
                            f25 *= fArr6[i12];
                        }
                    }
                    fArr2[1] = f26 / (f26 + f25);
                }
                float f28 = fArr2[1];
                if (f16 < f28) {
                    f16 = f28;
                    mediaType2 = mediaType;
                }
                float f29 = this.priorExtensionFileType;
                float f30 = 1.0f - f29;
                if (fArr2[2] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f31 = f29;
                    for (int i13 = 0; i13 < 3; i13++) {
                        float f32 = fArr7[i13];
                        f31 *= f32;
                        if (f32 != 1.0f) {
                            f30 *= fArr[i13];
                        }
                    }
                    fArr2[2] = f31 / (f31 + f30);
                }
                float f33 = fArr2[2];
                if (f16 < f33) {
                    f16 = f33;
                    mediaType2 = type;
                }
                i5++;
                list2 = list;
                mimeType3 = mimeType;
                size = i10;
                mediaType3 = mediaType;
            }
        }
        return f16 < this.threshold ? this.rootMediaType : mediaType2;
    }

    private void initializeDefaultProbabilityParameters() {
        this.priorMagicFileType = 0.5f;
        this.priorExtensionFileType = 0.5f;
        this.priorMetaFileType = 0.5f;
        this.magic_trust = DEFAULT_MAGIC_TRUST;
        this.extension_trust = 0.8f;
        this.meta_trust = 0.8f;
        this.magic_neg = 0.100000024f;
        this.extension_neg = 0.19999999f;
        this.meta_neg = 0.19999999f;
        this.threshold = 0.5001f;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Override // org.apache.tika.detect.Detector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.apache.tika.mime.MediaType detect(java.io.InputStream r6, org.apache.tika.metadata.Metadata r7) throws java.io.IOException {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r6 == 0) goto L28
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes
            int r1 = r1.getMinLength()
            r6.mark(r1)
            org.apache.tika.mime.MimeTypes r1 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            byte[] r1 = r1.readMagicHeader(r6)     // Catch: java.lang.Throwable -> L23
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: java.lang.Throwable -> L23
            java.util.List r1 = r2.getMimeType(r1)     // Catch: java.lang.Throwable -> L23
            r0.addAll(r1)     // Catch: java.lang.Throwable -> L23
            r6.reset()
            goto L28
        L23:
            r7 = move-exception
            r6.reset()
            throw r7
        L28:
            java.lang.String r6 = "resourceName"
            java.lang.String r6 = r7.get(r6)
            r1 = 0
            if (r6 == 0) goto L59
            java.net.URI r2 = new java.net.URI     // Catch: java.net.URISyntaxException -> L50
            r2.<init>(r6)     // Catch: java.net.URISyntaxException -> L50
            java.lang.String r2 = r2.getPath()     // Catch: java.net.URISyntaxException -> L50
            if (r2 == 0) goto L4f
            r3 = 47
            int r3 = r2.lastIndexOf(r3)     // Catch: java.net.URISyntaxException -> L50
            int r3 = r3 + 1
            int r4 = r2.length()     // Catch: java.net.URISyntaxException -> L50
            if (r3 >= r4) goto L4f
            java.lang.String r6 = r2.substring(r3)     // Catch: java.net.URISyntaxException -> L50
            goto L50
        L4f:
            r6 = r1
        L50:
            if (r6 == 0) goto L59
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes
            org.apache.tika.mime.MimeType r6 = r2.getMimeType(r6)
            goto L5a
        L59:
            r6 = r1
        L5a:
            java.lang.String r2 = "Content-Type"
            java.lang.String r7 = r7.get(r2)
            if (r7 == 0) goto L68
            org.apache.tika.mime.MimeTypes r2 = r5.mimeTypes     // Catch: org.apache.tika.mime.MimeTypeException -> L68
            org.apache.tika.mime.MimeType r1 = r2.forName(r7)     // Catch: org.apache.tika.mime.MimeTypeException -> L68
        L68:
            org.apache.tika.mime.MediaType r6 = r5.applyProbilities(r0, r6, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.mime.ProbabilisticMimeDetectionSelector.detect(java.io.InputStream, org.apache.tika.metadata.Metadata):org.apache.tika.mime.MediaType");
    }

    public MediaTypeRegistry getMediaTypeRegistry() {
        return this.mimeTypes.getMediaTypeRegistry();
    }

    public ProbabilisticMimeDetectionSelector(Builder builder) {
        this(MimeTypes.getDefaultMimeTypes(), builder);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes) {
        this(mimeTypes, null);
    }

    public ProbabilisticMimeDetectionSelector(MimeTypes mimeTypes, Builder builder) {
        this.mimeTypes = mimeTypes;
        this.rootMediaType = MediaType.OCTET_STREAM;
        initializeDefaultProbabilityParameters();
        this.changeRate = 0.1f;
        if (builder != null) {
            this.priorMagicFileType = builder.priorMagicFileType == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.priorMagicFileType : builder.priorMagicFileType;
            this.priorExtensionFileType = builder.priorExtensionFileType == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.priorExtensionFileType : builder.priorExtensionFileType;
            this.priorMetaFileType = builder.priorMetaFileType == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.priorMetaFileType : builder.priorMetaFileType;
            this.magic_trust = builder.magic_trust == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.magic_trust : builder.extension_neg;
            this.extension_trust = builder.extension_trust == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.extension_trust : builder.extension_trust;
            this.meta_trust = builder.meta_trust == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.meta_trust : builder.meta_trust;
            this.magic_neg = builder.magic_neg == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.magic_neg : builder.magic_neg;
            this.extension_neg = builder.extension_neg == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.extension_neg : builder.extension_neg;
            this.meta_neg = builder.meta_neg == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.meta_neg : builder.meta_neg;
            this.threshold = builder.threshold == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? this.threshold : builder.threshold;
        }
    }
}
