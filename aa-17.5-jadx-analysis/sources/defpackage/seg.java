package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import com.google.android.gms.carsetup.fsm.impl.FsmController;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class seg extends Fragment {
    public FsmController d;

    public int b(String str) {
        return 0;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onActivityCreated */
    public void m105lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m105lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
        if (this.d.g != null || ((bc) getContext()).isFinishing()) {
            return;
        }
        FsmController fsmController = this.d;
        if (fsmController.g != null) {
            fsmController.d();
            throw new RuntimeException("start already called");
        }
        ArrayList arrayList = fsmController.f;
        int size = arrayList.size();
        while (size > 0) {
            int i = size - 1;
            if (((FsmController.StackEntry) arrayList.get(i)).c) {
                break;
            }
            arrayList.remove(i);
            size = i;
        }
        if (size == 0) {
            fsmController.c(fsmController.e, null, null);
            return;
        }
        FsmController.StackEntry stackEntry = (FsmController.StackEntry) arrayList.get(size - 1);
        sej sejVar = fsmController.g;
        Class cls = stackEntry.a;
        Parcelable parcelable = stackEntry.b;
        fsmController.g = fsmController.l(cls);
        fsmController.h(sejVar, fsmController.g, null);
        fsmController.m(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        FsmController fsmController = this.d;
        if (fsmController != null) {
            seh sehVar = (seh) context;
            fsmController.b(sehVar);
            sehVar.E(this.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        bc bcVar = (bc) getContext();
        seh sehVar = (seh) bcVar;
        setRetainInstance(true);
        FsmController fsmController = new FsmController(bcVar, sehVar.C(), sehVar.D(), this, bundle);
        this.d = fsmController;
        sehVar.E(fsmController);
        this.d.b(sehVar);
    }

    @Override // android.support.v4.app.Fragment
    public final void onDetach() {
        FsmController fsmController = this.d;
        if (fsmController != null) {
            fsmController.j = null;
        }
        super.onDetach();
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public void m117x22bc4f96(Bundle bundle) {
        bundle.putParcelableArrayList(FsmController.b, this.d.f);
    }

    public void gP(zab zabVar) {
    }

    public void k(int i, int i2, int i3) {
    }
}
