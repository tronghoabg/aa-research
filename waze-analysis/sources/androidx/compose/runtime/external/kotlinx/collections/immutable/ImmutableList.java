package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import h.a.g;
import h.g.b.a.a;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WazeSource */
    protected final class SubList<E> extends g<E> implements ImmutableList<E>, j$.util.List<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i2, int i3) {
            this.source = immutableList;
            this.fromIndex = i2;
            this.toIndex = i3;
            ListImplementation.checkRangeIndexes$runtime(i2, i3, immutableList.size());
            this._size = i3 - i2;
        }

        @Override // h.a.g, java.util.List
        public E get(int i2) {
            ListImplementation.checkElementIndex$runtime(i2, this._size);
            return this.source.get(this.fromIndex + i2);
        }

        @Override // h.a.g, h.a.a
        public int getSize() {
            return this._size;
        }

        @Override // h.a.g, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList<E> subList(int i2, int i3) {
            ListImplementation.checkRangeIndexes$runtime(i2, i3, this._size);
            int i4 = this.fromIndex;
            return new SubList(this.source, i2 + i4, i4 + i3);
        }
    }

    @Override // java.util.List
    ImmutableList<E> subList(int i2, int i3);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static ImmutableList $default$subList(ImmutableList immutableList, int i2, int i3) {
            return new SubList(immutableList, i2, i3);
        }
    }
}
