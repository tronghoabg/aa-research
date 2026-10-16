package Ta;

import G9.e;
import android.os.AsyncTask;

/* loaded from: classes4.dex */
public abstract class a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public e f11817a;

    /* renamed from: b, reason: collision with root package name */
    public final S3.c f11818b;

    public a(S3.c cVar) {
        this.f11818b = cVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        e eVar = this.f11817a;
        if (eVar != null) {
            eVar.f4687d = null;
            eVar.o();
        }
    }
}
