package androidx.compose.material3;

import androidx.compose.ui.Alignment;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class TextFieldLabelPosition {
    public static final int $stable = 0;

    private TextFieldLabelPosition() {
    }

    public /* synthetic */ TextFieldLabelPosition(o oVar) {
        this();
    }

    /* compiled from: WazeSource */
    public final class Above extends TextFieldLabelPosition {
        public static final int $stable = 0;
        private final Alignment.Horizontal alignment;

        public /* synthetic */ Above(Alignment.Horizontal horizontal, int i2, o oVar) {
            this((i2 & 1) != 0 ? Alignment.Companion.getStart() : horizontal);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Above) {
                return x.n(this.alignment, ((Above) obj).alignment);
            }
            return false;
        }

        public final Alignment.Horizontal getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public String toString() {
            return "Above(alignment=" + this.alignment + ')';
        }

        public Above(Alignment.Horizontal horizontal) {
            super(null);
            this.alignment = horizontal;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Above() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: WazeSource */
    public final class Attached extends TextFieldLabelPosition {
        public static final int $stable = 0;
        private final boolean alwaysMinimize;
        private final Alignment.Horizontal expandedAlignment;
        private final Alignment.Horizontal minimizedAlignment;

        public /* synthetic */ Attached(boolean z, Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2, int i2, o oVar) {
            this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), (i2 & 2) != 0 ? Alignment.Companion.getStart() : horizontal, (i2 & 4) != 0 ? Alignment.Companion.getStart() : horizontal2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attached)) {
                return false;
            }
            Attached attached = (Attached) obj;
            return this.alwaysMinimize == attached.alwaysMinimize && x.n(this.minimizedAlignment, attached.minimizedAlignment) && x.n(this.expandedAlignment, attached.expandedAlignment);
        }

        public final boolean getAlwaysMinimize() {
            return this.alwaysMinimize;
        }

        public final Alignment.Horizontal getExpandedAlignment() {
            return this.expandedAlignment;
        }

        public final Alignment.Horizontal getMinimizedAlignment() {
            return this.minimizedAlignment;
        }

        public int hashCode() {
            return (((TextFieldLabelPosition$Attached$$ExternalSyntheticBackport0.m(this.alwaysMinimize) * 31) + this.minimizedAlignment.hashCode()) * 31) + this.expandedAlignment.hashCode();
        }

        public String toString() {
            return "Attached(alwaysMinimize=" + this.alwaysMinimize + ", minimizedAlignment=" + this.minimizedAlignment + ", expandedAlignment=" + this.expandedAlignment + ')';
        }

        public Attached(boolean z, Alignment.Horizontal horizontal, Alignment.Horizontal horizontal2) {
            super(null);
            this.alwaysMinimize = z;
            this.minimizedAlignment = horizontal;
            this.expandedAlignment = horizontal2;
        }

        public Attached() {
            this(false, null, null, 7, null);
        }
    }
}
