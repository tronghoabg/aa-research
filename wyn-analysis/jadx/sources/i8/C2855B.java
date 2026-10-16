package i8;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: i8.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2855B extends z {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f36882g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z f36883h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f36884i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2855B(d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, z zVar) {
        super(taskCompletionSource);
        this.f36884i = dVar;
        this.f36882g = taskCompletionSource2;
        this.f36883h = zVar;
    }

    @Override // i8.z
    public final void b() {
        synchronized (this.f36884i.f36897f) {
            try {
                d dVar = this.f36884i;
                TaskCompletionSource taskCompletionSource = this.f36882g;
                dVar.f36896e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new X2.j(18, dVar, taskCompletionSource));
                if (this.f36884i.f36902l.getAndIncrement() > 0) {
                    this.f36884i.f36893b.b("Already connected to the service.", new Object[0]);
                }
                d.b(this.f36884i, this.f36883h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
