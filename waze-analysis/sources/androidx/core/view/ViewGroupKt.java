package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.a.a;
import h.g.b.x;
import h.k.j;
import h.k.n;
import h.m.h;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewGroupKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    public final class AnonymousClass1 implements Iterator<View>, a {
        final /* synthetic */ ViewGroup $this_iterator;
        private int index;

        AnonymousClass1(ViewGroup viewGroup) {
            this.$this_iterator = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getChildCount();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public View next() {
            int i2 = this.index;
            this.index = i2 + 1;
            View childAt = this.$this_iterator.getChildAt(i2);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int i2 = this.index - 1;
            this.index = i2;
            this.$this_iterator.removeViewAt(i2);
        }
    }

    public static final boolean contains(ViewGroup viewGroup, View view) {
        x.f(viewGroup, "<this>");
        x.f(view, "view");
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, l<? super View, ab> lVar) {
        x.f(viewGroup, "<this>");
        x.f(lVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            x.e(childAt, "getChildAt(...)");
            lVar.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, p<? super Integer, ? super View, ab> pVar) {
        x.f(viewGroup, "<this>");
        x.f(pVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Integer numValueOf = Integer.valueOf(i2);
            View childAt = viewGroup.getChildAt(i2);
            x.e(childAt, "getChildAt(...)");
            pVar.invoke(numValueOf, childAt);
        }
    }

    public static final View get(ViewGroup viewGroup, int i2) {
        x.f(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i2);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i2 + ", Size: " + viewGroup.getChildCount());
    }

    public static final h<View> getChildren(final ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return new h<View>() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // h.m.h
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final h<View> getDescendants(final ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return new h<View>() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // h.m.h
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), new l<View, Iterator<? extends View>>() { // from class: androidx.core.view.ViewGroupKt$descendants$1$1
                    @Override // h.g.a.l
                    public final Iterator<View> invoke(View view) {
                        x.f(view, "child");
                        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
                        if (viewGroup2 != null) {
                            return ViewGroupKt.getChildren(viewGroup2).iterator();
                        }
                        return null;
                    }
                });
            }
        };
    }

    public static final j getIndices(ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return n.u(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        x.f(viewGroup, "<this>");
        return new AnonymousClass1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        x.f(viewGroup, "<this>");
        x.f(view, "view");
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        x.f(viewGroup, "<this>");
        x.f(view, "view");
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        x.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i2, i2, i2, i2);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5) {
        x.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = marginLayoutParams.leftMargin;
        }
        if ((i6 & 2) != 0) {
            i3 = marginLayoutParams.topMargin;
        }
        if ((i6 & 4) != 0) {
            i4 = marginLayoutParams.rightMargin;
        }
        if ((i6 & 8) != 0) {
            i5 = marginLayoutParams.bottomMargin;
        }
        x.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i2, i3, i4, i5);
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5) {
        x.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i4);
        marginLayoutParams.bottomMargin = i5;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = marginLayoutParams.getMarginStart();
        }
        if ((i6 & 2) != 0) {
            i3 = marginLayoutParams.topMargin;
        }
        if ((i6 & 4) != 0) {
            i4 = marginLayoutParams.getMarginEnd();
        }
        if ((i6 & 8) != 0) {
            i5 = marginLayoutParams.bottomMargin;
        }
        x.f(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i2);
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.setMarginEnd(i4);
        marginLayoutParams.bottomMargin = i5;
    }
}
