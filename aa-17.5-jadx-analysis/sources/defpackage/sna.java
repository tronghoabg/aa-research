package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class sna extends Fragment implements smo {
    public static final WeakHashMap a = new WeakHashMap();
    public final adzp b = new adzp();

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (smn smnVar : this.b.a.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.b.a.values().iterator();
        while (it.hasNext()) {
            ((smn) it.next()).c(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        adzp adzpVar = this.b;
        adzpVar.b = 1;
        adzpVar.c = bundle;
        for (Map.Entry entry : adzpVar.a.entrySet()) {
            ((smn) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        adzp adzpVar = this.b;
        adzpVar.b = 5;
        for (smn smnVar : adzpVar.a.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        adzp adzpVar = this.b;
        adzpVar.b = 3;
        Iterator it = adzpVar.a.values().iterator();
        while (it.hasNext()) {
            ((smn) it.next()).h();
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.b.a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((smn) entry.getValue()).g(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        adzp adzpVar = this.b;
        adzpVar.b = 2;
        Iterator it = adzpVar.a.values().iterator();
        while (it.hasNext()) {
            ((smn) it.next()).i();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.support.v4.app.Fragment
    public final void onStop() {
        super.onStop();
        adzp adzpVar = this.b;
        adzpVar.b = 4;
        Iterator it = adzpVar.a.values().iterator();
        while (it.hasNext()) {
            ((smn) it.next()).j();
        }
    }
}
