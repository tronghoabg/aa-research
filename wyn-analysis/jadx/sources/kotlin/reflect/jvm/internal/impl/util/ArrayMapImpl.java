package kotlin.reflect.jvm.internal.impl.util;

import ff.AbstractC2647b;
import ff.m;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class ArrayMapImpl<T> extends ArrayMap<T> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private Object[] data;
    private int size;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private ArrayMapImpl(Object[] objArr, int i5) {
        super(null);
        this.data = objArr;
        this.size = i5;
    }

    private final void ensureCapacity(int i5) {
        Object[] objArr = this.data;
        if (objArr.length > i5) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i5);
        Object[] objArrCopyOf = Arrays.copyOf(this.data, length);
        AbstractC3340k.d(objArrCopyOf, "copyOf(...)");
        this.data = objArrCopyOf;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    @Nullable
    public T get(int i5) {
        return (T) m.x0(i5, this.data);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap, java.lang.Iterable
    @NotNull
    public Iterator<T> iterator() {
        return new AbstractC2647b(this) { // from class: kotlin.reflect.jvm.internal.impl.util.ArrayMapImpl.iterator.1
            private int index = -1;
            final /* synthetic */ ArrayMapImpl<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // ff.AbstractC2647b
            public void computeNext() {
                do {
                    int i5 = this.index + 1;
                    this.index = i5;
                    if (i5 >= ((ArrayMapImpl) this.this$0).data.length) {
                        break;
                    }
                } while (((ArrayMapImpl) this.this$0).data[this.index] == null);
                if (this.index >= ((ArrayMapImpl) this.this$0).data.length) {
                    done();
                    return;
                }
                Object obj = ((ArrayMapImpl) this.this$0).data[this.index];
                AbstractC3340k.c(obj, "null cannot be cast to non-null type T of org.jetbrains.kotlin.util.ArrayMapImpl");
                setNext(obj);
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.ArrayMap
    public void set(int i5, @NotNull T value) {
        AbstractC3340k.e(value, "value");
        ensureCapacity(i5);
        if (this.data[i5] == null) {
            this.size = getSize() + 1;
        }
        this.data[i5] = value;
    }

    public ArrayMapImpl() {
        this(new Object[20], 0);
    }
}
