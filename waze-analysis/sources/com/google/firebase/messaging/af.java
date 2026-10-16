package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af {

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f10126b;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f10129e;

    /* renamed from: a, reason: collision with root package name */
    final ArrayDeque f10125a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final String f10127c = "topic_operation_queue";

    /* renamed from: d, reason: collision with root package name */
    private final String f10128d = ",";

    private af(SharedPreferences sharedPreferences, Executor executor) {
        this.f10126b = sharedPreferences;
        this.f10129e = executor;
    }

    public static /* synthetic */ void a(af afVar) {
        ArrayDeque arrayDeque = afVar.f10125a;
        synchronized (arrayDeque) {
            SharedPreferences.Editor editorEdit = afVar.f10126b.edit();
            String str = afVar.f10127c;
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(afVar.f10128d);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    static af b(SharedPreferences sharedPreferences, Executor executor) {
        af afVar = new af(sharedPreferences, executor);
        ArrayDeque arrayDeque = afVar.f10125a;
        synchronized (arrayDeque) {
            arrayDeque.clear();
            String string = afVar.f10126b.getString(afVar.f10127c, "");
            if (!TextUtils.isEmpty(string)) {
                String str = afVar.f10128d;
                if (string.contains(str)) {
                    String[] strArrSplit = string.split(str, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str2 : strArrSplit) {
                        if (!TextUtils.isEmpty(str2)) {
                            arrayDeque.add(str2);
                        }
                    }
                    return afVar;
                }
            }
            return afVar;
        }
    }

    public final void c(Object obj) {
        ArrayDeque arrayDeque = this.f10125a;
        synchronized (arrayDeque) {
            if (arrayDeque.remove(obj)) {
                this.f10129e.execute(new Runnable() { // from class: com.google.firebase.messaging.ae
                    @Override // java.lang.Runnable
                    public final void run() {
                        af.a(this.f10124a);
                    }
                });
            }
        }
    }
}
