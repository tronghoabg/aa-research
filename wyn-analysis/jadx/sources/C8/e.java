package C8;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ff.AbstractC2641B;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Continuation, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1917c;

    public /* synthetic */ e(int i5, Object obj, boolean z2) {
        this.f1915a = i5;
        this.f1916b = obj;
        this.f1917c = z2;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = AbstractC2641B.w((Context) this.f1916b).edit();
        editorEdit.putBoolean("proxy_retention", this.f1917c);
        editorEdit.apply();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f1915a) {
            case 0:
                boolean z2 = this.f1917c;
                f fVar = (f) this.f1916b;
                if (!z2 && fVar.b()) {
                    return Tasks.forResult(c.a(fVar.f1929m));
                }
                if (fVar.f1928l == null) {
                    return Tasks.forResult(new c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new s8.j("No AppCheckProvider installed.")));
                }
                Task task2 = fVar.f1930n;
                if (task2 == null || task2.isComplete() || fVar.f1930n.isCanceled()) {
                    fVar.f1930n = fVar.f1928l.getToken().onSuccessTask(fVar.f1924g, new B8.b(fVar, 2));
                }
                return fVar.f1930n.continueWithTask(fVar.f1925h, new A5.f(2));
            default:
                f fVar2 = (f) this.f1916b;
                if (!this.f1917c && fVar2.b()) {
                    return Tasks.forResult(fVar2.f1929m);
                }
                if (fVar2.f1928l == null) {
                    return Tasks.forException(new s8.j("No AppCheckProvider installed."));
                }
                Task task3 = fVar2.f1930n;
                if (task3 == null || task3.isComplete() || fVar2.f1930n.isCanceled()) {
                    fVar2.f1930n = fVar2.f1928l.getToken().onSuccessTask(fVar2.f1924g, new B8.b(fVar2, 2));
                }
                return fVar2.f1930n;
        }
    }
}
