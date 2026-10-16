package io.flutter.plugin.editing;

import D9.n;
import U1.AbstractC0832b;
import a2.C1323c;
import a2.v;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.util.SparseArray;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.platform.p;
import kc.r;
import t6.q;
import tc.k;
import tc.l;
import uc.C4281r;

/* loaded from: classes5.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r f37062a;

    /* renamed from: b, reason: collision with root package name */
    public final InputMethodManager f37063b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f37064c;

    /* renamed from: d, reason: collision with root package name */
    public final q f37065d;

    /* renamed from: e, reason: collision with root package name */
    public n f37066e = new n(1, 0, 8);

    /* renamed from: f, reason: collision with root package name */
    public k f37067f;

    /* renamed from: g, reason: collision with root package name */
    public SparseArray f37068g;

    /* renamed from: h, reason: collision with root package name */
    public e f37069h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f37070i;

    /* renamed from: j, reason: collision with root package name */
    public InputConnection f37071j;
    public final io.flutter.plugin.platform.q k;

    /* renamed from: l, reason: collision with root package name */
    public final p f37072l;

    /* renamed from: m, reason: collision with root package name */
    public Rect f37073m;

    /* renamed from: n, reason: collision with root package name */
    public final ImeSyncDeferringInsetsCallback f37074n;

    /* renamed from: o, reason: collision with root package name */
    public l f37075o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f37076p;

    public i(r rVar, q qVar, v vVar, io.flutter.plugin.platform.q qVar2, p pVar) {
        this.f37062a = rVar;
        this.f37069h = new e(null, rVar);
        this.f37063b = (InputMethodManager) rVar.getContext().getSystemService("input_method");
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            this.f37064c = AbstractC0832b.i(rVar.getContext().getSystemService(AbstractC0832b.m()));
        } else {
            this.f37064c = null;
        }
        if (i5 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(rVar);
            this.f37074n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f37065d = qVar;
        qVar.f45907b = new C1323c(this, 13);
        ((C4281r) qVar.f45906a).a("TextInputClient.requestExistingInputState", null, null);
        this.k = qVar2;
        qVar2.f37138f = this;
        this.f37072l = pVar;
        pVar.f37122f = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r10 == r0.f46031e) goto L44;
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // io.flutter.plugin.editing.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.i.a(boolean):void");
    }

    public final void b(int i5) {
        n nVar = this.f37066e;
        int i10 = nVar.f2592b;
        if ((i10 == 3 || i10 == 4) && nVar.f2593c == i5) {
            this.f37066e = new n(1, 0, 8);
            d();
            r rVar = this.f37062a;
            IBinder applicationWindowToken = rVar.getApplicationWindowToken();
            InputMethodManager inputMethodManager = this.f37063b;
            inputMethodManager.hideSoftInputFromWindow(applicationWindowToken, 0);
            inputMethodManager.restartInput(rVar);
            this.f37070i = false;
        }
    }

    public final void c() {
        this.k.f37138f = null;
        this.f37072l.f37122f = null;
        this.f37065d.f45907b = null;
        d();
        this.f37069h.e(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f37074n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public final void d() {
        AutofillManager autofillManager;
        k kVar;
        S3.i iVar;
        if (Build.VERSION.SDK_INT < 26 || (autofillManager = this.f37064c) == null || (kVar = this.f37067f) == null || (iVar = kVar.f46025j) == null || this.f37068g == null) {
            return;
        }
        autofillManager.notifyViewExited(this.f37062a, ((String) iVar.f10961a).hashCode());
    }

    public final void e(k kVar) {
        S3.i iVar;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (kVar == null || (iVar = kVar.f46025j) == null) {
            this.f37068g = null;
            return;
        }
        SparseArray sparseArray = new SparseArray();
        this.f37068g = sparseArray;
        k[] kVarArr = kVar.f46026l;
        if (kVarArr == null) {
            sparseArray.put(((String) iVar.f10961a).hashCode(), kVar);
            return;
        }
        for (k kVar2 : kVarArr) {
            S3.i iVar2 = kVar2.f46025j;
            if (iVar2 != null) {
                SparseArray sparseArray2 = this.f37068g;
                String str = (String) iVar2.f10961a;
                sparseArray2.put(str.hashCode(), kVar2);
                this.f37064c.notifyValueChanged(this.f37062a, str.hashCode(), AutofillValue.forText(((l) iVar2.f10963c).f46027a));
            }
        }
    }
}
