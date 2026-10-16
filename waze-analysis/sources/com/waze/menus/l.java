package com.waze.menus;

import android.os.AsyncTask;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private final p f29741a;

    l(p pVar) {
        this.f29741a = pVar;
    }

    public final String a() {
        return this.f29741a.f29745a;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f29741a.c();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        p.d(this.f29741a, (List) obj);
    }
}
