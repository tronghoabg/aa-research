package com.waze.push;

import android.app.Notification;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.waze.reports.cx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private final String f33434a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.settings.tree.a.a f33435b;

    i(String str, com.waze.settings.tree.a.a aVar) {
        this.f33434a = str;
        this.f33435b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(Bitmap bitmap) {
        com.waze.settings.tree.a.a aVar = this.f33435b;
        Object obj = aVar.f37461a;
        Object obj2 = aVar.f37462b;
        if (bitmap != null) {
            ((NotificationCompat.Builder) obj).setLargeIcon(bitmap);
        }
        Notification notificationBuild = ((NotificationCompat.Builder) obj).build();
        j jVar = (j) ((cx) obj2).f33818a;
        ((NotificationManagerCompat) jVar.f33437b).notify(((g) jVar.f33438c).o(), 2, notificationBuild);
    }

    protected final Bitmap b() {
        String str = this.f33434a;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return com.waze.utils.o.d(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return b();
    }
}
