package androidx.camera.common.internal;

import android.util.Size;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class StreamSizeImpl extends StreamSize {

    /* compiled from: WazeSource */
    public final class Absolute extends StreamSizeImpl {
        private final AbsoluteSizeEnum value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Absolute(AbsoluteSizeEnum absoluteSizeEnum) {
            super(null);
            x.f(absoluteSizeEnum, "value");
            this.value = absoluteSizeEnum;
        }

        public static /* synthetic */ Absolute copy$default(Absolute absolute, AbsoluteSizeEnum absoluteSizeEnum, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                absoluteSizeEnum = absolute.value;
            }
            return absolute.copy(absoluteSizeEnum);
        }

        public final AbsoluteSizeEnum component1() {
            return this.value;
        }

        public final Absolute copy(AbsoluteSizeEnum absoluteSizeEnum) {
            x.f(absoluteSizeEnum, "value");
            return new Absolute(absoluteSizeEnum);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Absolute) && this.value == ((Absolute) obj).value;
        }

        @Override // androidx.camera.common.internal.StreamSize
        public Size getAbsoluteSize() {
            return this.value.getSize();
        }

        public final AbsoluteSizeEnum getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            AbsoluteSizeEnum absoluteSizeEnum = this.value;
            return absoluteSizeEnum.name() + "(" + absoluteSizeEnum.getSize() + ")";
        }
    }

    /* compiled from: WazeSource */
    public final class Abstract extends StreamSizeImpl {
        private final AbstractSizeEnum value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Abstract(AbstractSizeEnum abstractSizeEnum) {
            super(null);
            x.f(abstractSizeEnum, "value");
            this.value = abstractSizeEnum;
        }

        public static /* synthetic */ Abstract copy$default(Abstract r0, AbstractSizeEnum abstractSizeEnum, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                abstractSizeEnum = r0.value;
            }
            return r0.copy(abstractSizeEnum);
        }

        public final AbstractSizeEnum component1() {
            return this.value;
        }

        public final Abstract copy(AbstractSizeEnum abstractSizeEnum) {
            x.f(abstractSizeEnum, "value");
            return new Abstract(abstractSizeEnum);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Abstract) && this.value == ((Abstract) obj).value;
        }

        @Override // androidx.camera.common.internal.StreamSize
        public Size getAbsoluteSize() {
            return null;
        }

        public final AbstractSizeEnum getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return this.value.name();
        }
    }

    /* compiled from: WazeSource */
    public final class Custom extends StreamSizeImpl {
        private final Size size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(Size size) {
            super(null);
            x.f(size, "size");
            this.size = size;
        }

        public static /* synthetic */ Custom copy$default(Custom custom, Size size, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                size = custom.size;
            }
            return custom.copy(size);
        }

        public final Size component1() {
            return this.size;
        }

        public final Custom copy(Size size) {
            x.f(size, "size");
            return new Custom(size);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && x.n(this.size, ((Custom) obj).size);
        }

        @Override // androidx.camera.common.internal.StreamSize
        public Size getAbsoluteSize() {
            return this.size;
        }

        public final Size getSize() {
            return this.size;
        }

        public int hashCode() {
            return this.size.hashCode();
        }

        public String toString() {
            return "CUSTOM(" + this.size + ")";
        }
    }

    private StreamSizeImpl() {
    }

    public /* synthetic */ StreamSizeImpl(o oVar) {
        this();
    }
}
