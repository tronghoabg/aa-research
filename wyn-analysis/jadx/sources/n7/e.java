package N7;

import android.os.Bundle;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.internal.V;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import h6.C2783b;
import h6.C2785d;
import h6.C2791j;
import h6.InterfaceC2788g;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k1.S;
import kc.x;
import u6.AbstractC4256a;

/* loaded from: classes4.dex */
public final class e implements InterfaceC2788g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8587a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8588b;

    /* renamed from: c, reason: collision with root package name */
    public int f8589c;

    /* renamed from: d, reason: collision with root package name */
    public Object f8590d;

    /* renamed from: e, reason: collision with root package name */
    public Object f8591e;

    public e(int i5) {
        this.f8587a = i5;
        switch (i5) {
            case 3:
                this.f8590d = new C2791j(1);
                this.f8591e = new ArrayDeque();
                for (int i10 = 0; i10 < 2; i10++) {
                    ((ArrayDeque) this.f8591e).addFirst(new C2785d(this, 0));
                }
                this.f8589c = 0;
                break;
        }
    }

    @Override // H5.d
    public Object b() {
        AbstractC4256a.i(!this.f8588b);
        if (this.f8589c != 2) {
            return null;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f8591e;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        C2785d c2785d = (C2785d) arrayDeque.removeFirst();
        C2791j c2791j = (C2791j) this.f8590d;
        if (c2791j.h(4)) {
            c2785d.b(4);
        } else {
            long j8 = c2791j.f4919f;
            ByteBuffer byteBuffer = c2791j.f4917d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            parcelableArrayList.getClass();
            c2785d.q(c2791j.f4919f, new A2.c(j8, AbstractC4256a.s(C2783b.f36167s, parcelableArrayList)), 0L);
        }
        c2791j.o();
        this.f8589c = 0;
        return c2785d;
    }

    @Override // H5.d
    public Object c() {
        AbstractC4256a.i(!this.f8588b);
        if (this.f8589c != 0) {
            return null;
        }
        this.f8589c = 1;
        return (C2791j) this.f8590d;
    }

    @Override // H5.d
    public void d(C2791j c2791j) {
        AbstractC4256a.i(!this.f8588b);
        AbstractC4256a.i(this.f8589c == 1);
        AbstractC4256a.e(((C2791j) this.f8590d) == c2791j);
        this.f8589c = 2;
    }

    public V e() {
        AbstractC1732v.a("execute parameter required", ((InterfaceC1708w) this.f8590d) != null);
        return new V(this, (d7.d[]) this.f8591e, this.f8588b, this.f8589c);
    }

    public void f(int i5) {
        switch (this.f8587a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f8591e;
                WeakReference weakReference = bottomSheetBehavior.f26808U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f8589c = i5;
                    if (!this.f8588b) {
                        View view = (View) bottomSheetBehavior.f26808U.get();
                        A7.V v2 = (A7.V) this.f8590d;
                        WeakHashMap weakHashMap = S.f38779a;
                        view.postOnAnimation(v2);
                        this.f8588b = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8591e;
                WeakReference weakReference2 = sideSheetBehavior.f27001o;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f8589c = i5;
                    if (!this.f8588b) {
                        View view2 = (View) sideSheetBehavior.f27001o.get();
                        com.applovin.adview.a aVar = (com.applovin.adview.a) this.f8590d;
                        WeakHashMap weakHashMap2 = S.f38779a;
                        view2.postOnAnimation(aVar);
                        this.f8588b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // H5.d
    public void flush() {
        AbstractC4256a.i(!this.f8588b);
        ((C2791j) this.f8590d).o();
        this.f8589c = 0;
    }

    @Override // H5.d
    public void release() {
        this.f8588b = true;
    }

    public e(Dd.c cVar, KeyEvent keyEvent) {
        this.f8587a = 4;
        this.f8591e = cVar;
        this.f8589c = ((x[]) cVar.f2642b).length;
        this.f8588b = false;
        this.f8590d = keyEvent;
    }

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f8587a = 2;
        this.f8591e = sideSheetBehavior;
        this.f8590d = new com.applovin.adview.a(this, 21);
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f8587a = 0;
        this.f8591e = bottomSheetBehavior;
        this.f8590d = new A7.V(this, 16);
    }

    @Override // h6.InterfaceC2788g
    public void a(long j8) {
    }
}
