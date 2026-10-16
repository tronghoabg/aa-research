package com.google.d.b;

import android.content.Context;
import android.preference.PreferenceManager;
import com.google.e.a.h.az;
import com.google.e.a.h.bu;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final String f7248a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7249b;

    public v(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.f7248a = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.f7249b = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.f7249b = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    public final void a(StringBuilder sb, Iterable iterable) throws IOException {
        Iterator it = iterable.iterator();
        try {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object obj = this.f7249b;
                sb.append(w.g(entry.getKey()));
                String str = this.f7248a;
                sb.append((CharSequence) str);
                sb.append(w.g(entry.getValue()));
                while (it.hasNext()) {
                    sb.append((CharSequence) w.c((w) obj));
                    Map.Entry entry2 = (Map.Entry) it.next();
                    sb.append(w.g(entry2.getKey()));
                    sb.append((CharSequence) str);
                    sb.append(w.g(entry2.getValue()));
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void b(az azVar) throws IOException {
        if (!this.f7249b.putString(this.f7248a, com.google.e.a.f.a.e.b(azVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences$Editor, java.lang.Object] */
    public final void c(bu buVar) throws IOException {
        if (!this.f7249b.putString(this.f7248a, com.google.e.a.f.a.e.b(buVar.toByteArray())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    /* synthetic */ v(w wVar, String str) {
        this.f7249b = wVar;
        this.f7248a = str;
    }
}
