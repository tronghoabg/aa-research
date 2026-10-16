package J9;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: classes4.dex */
public final /* synthetic */ class A implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Se.c f5837a;

    public /* synthetic */ A(Se.c cVar) {
        this.f5837a = cVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        Se.c cVar = this.f5837a;
        cVar.onError(exc);
        cVar.onComplete();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Je.b bVar;
        Se.c cVar = this.f5837a;
        Object obj2 = cVar.get();
        Me.a aVar = Me.a.f7633a;
        if (obj2 != aVar && (bVar = (Je.b) cVar.getAndSet(aVar)) != aVar) {
            He.h hVar = (He.h) cVar.f11069b;
            try {
                if (obj == null) {
                    hVar.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    hVar.onSuccess(obj);
                }
                if (bVar != null) {
                    bVar.dispose();
                }
            } catch (Throwable th) {
                if (bVar != null) {
                    bVar.dispose();
                }
                throw th;
            }
        }
        cVar.onComplete();
    }
}
