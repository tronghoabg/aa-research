package androidx.media3.exoplayer.text;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleDecoder;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        private final DefaultSubtitleParserFactory delegate = new DefaultSubtitleParserFactory();

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        
            if (r0.equals(androidx.media3.common.MimeTypes.APPLICATION_CEA608) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            if (r0.equals(androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608) != false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        
            return new androidx.media3.extractor.text.cea.Cea608Decoder(r0, r4.accessibilityChannel, androidx.media3.extractor.text.cea.Cea608Decoder.MIN_DATA_CHANNEL_TIMEOUT_MS);
         */
        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.media3.extractor.text.SubtitleDecoder createDecoder(androidx.media3.common.Format r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.sampleMimeType
                if (r0 == 0) goto L45
                int r1 = r0.hashCode()
                r2 = 930165504(0x37713300, float:1.4376594E-5)
                if (r1 == r2) goto L33
                r2 = 1566015601(0x5d578071, float:9.705335E17)
                if (r1 == r2) goto L2a
                r2 = 1566016562(0x5d578432, float:9.705995E17)
                if (r1 == r2) goto L18
                goto L45
            L18:
                java.lang.String r1 = "application/cea-708"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L45
                androidx.media3.extractor.text.cea.Cea708Decoder r3 = new androidx.media3.extractor.text.cea.Cea708Decoder
                int r0 = r4.accessibilityChannel
                java.util.List<byte[]> r4 = r4.initializationData
                r3.<init>(r0, r4)
                return r3
            L2a:
                java.lang.String r1 = "application/cea-608"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L45
                goto L3b
            L33:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L45
            L3b:
                androidx.media3.extractor.text.cea.Cea608Decoder r3 = new androidx.media3.extractor.text.cea.Cea608Decoder
                int r4 = r4.accessibilityChannel
                r1 = 16000(0x3e80, double:7.905E-320)
                r3.<init>(r0, r4, r1)
                return r3
            L45:
                androidx.media3.extractor.text.DefaultSubtitleParserFactory r1 = r3.delegate
                boolean r1 = r1.supportsFormat(r4)
                if (r1 == 0) goto L6b
                androidx.media3.extractor.text.DefaultSubtitleParserFactory r3 = r3.delegate
                androidx.media3.extractor.text.SubtitleParser r3 = r3.create(r4)
                androidx.media3.exoplayer.text.DelegatingSubtitleDecoder r4 = new androidx.media3.exoplayer.text.DelegatingSubtitleDecoder
                java.lang.Class r0 = r3.getClass()
                java.lang.String r0 = r0.getSimpleName()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "Decoder"
                java.lang.String r0 = r0.concat(r1)
                r4.<init>(r0, r3)
                return r4
            L6b:
                java.lang.String r3 = java.lang.String.valueOf(r0)
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported MIME type: "
                java.lang.String r3 = r0.concat(r3)
                r4.<init>(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.SubtitleDecoderFactory.AnonymousClass1.createDecoder(androidx.media3.common.Format):androidx.media3.extractor.text.SubtitleDecoder");
        }

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            DefaultSubtitleParserFactory defaultSubtitleParserFactory = this.delegate;
            String str = format.sampleMimeType;
            return defaultSubtitleParserFactory.supportsFormat(format) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
        }
    };

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
