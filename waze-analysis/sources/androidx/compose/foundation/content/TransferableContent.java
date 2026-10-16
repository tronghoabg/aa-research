package androidx.compose.foundation.content;

import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransferableContent {
    public static final int $stable = 8;
    private final ClipEntry clipEntry;
    private final ClipMetadata clipMetadata;
    private final PlatformTransferableContent platformTransferableContent;
    private final int source;

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, int i3, o oVar) {
        this(clipEntry, clipMetadata, i2, (i3 & 8) != 0 ? null : platformTransferableContent, null);
    }

    public final ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    public final ClipMetadata getClipMetadata() {
        return this.clipMetadata;
    }

    public final PlatformTransferableContent getPlatformTransferableContent() {
        return this.platformTransferableContent;
    }

    /* renamed from: getSource-kB6V9T0, reason: not valid java name */
    public final int m2076getSourcekB6V9T0() {
        return this.source;
    }

    /* compiled from: WazeSource */
    @a
    public final class Source {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Keyboard = 0;
        private static final int DragAndDrop = 1;
        private static final int Clipboard = 2;

        private /* synthetic */ Source(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Source m2077boximpl(int i2) {
            return new Source(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m2079equalsimpl(int i2, Object obj) {
            return (obj instanceof Source) && i2 == ((Source) obj).m2083unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m2080equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m2082toStringimpl(int i2) {
            if (m2080equalsimpl0(i2, Keyboard)) {
                return "Source.Keyboard";
            }
            if (m2080equalsimpl0(i2, DragAndDrop)) {
                return "Source.DragAndDrop";
            }
            if (m2080equalsimpl0(i2, Clipboard)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i2 + ')';
        }

        public boolean equals(Object obj) {
            return m2079equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m2082toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m2083unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m2084getClipboardkB6V9T0() {
                return Source.Clipboard;
            }

            /* renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m2085getDragAndDropkB6V9T0() {
                return Source.DragAndDrop;
            }

            /* renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m2086getKeyboardkB6V9T0() {
                return Source.Keyboard;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m2078constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m2081hashCodeimpl(int i2) {
            return i2;
        }
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent, o oVar) {
        this(clipEntry, clipMetadata, i2, platformTransferableContent);
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i2, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i2;
        this.platformTransferableContent = platformTransferableContent;
    }
}
