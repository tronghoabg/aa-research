package m9;

import android.content.Context;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class I implements s8.h {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f40431a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final s8.g f40432b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f40433c;

    /* renamed from: d, reason: collision with root package name */
    public final L8.r f40434d;

    /* renamed from: e, reason: collision with root package name */
    public final L8.r f40435e;

    /* renamed from: f, reason: collision with root package name */
    public final v9.h f40436f;

    public I(Context context, s8.g gVar, L8.r rVar, L8.r rVar2, v9.h hVar) {
        this.f40433c = context;
        this.f40432b = gVar;
        this.f40434d = rVar;
        this.f40435e = rVar2;
        this.f40436f = hVar;
        gVar.a();
        gVar.f45337j.add(this);
    }

    @Override // s8.h
    public final synchronized void a() {
        Iterator it = new ArrayList(this.f40431a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).j();
            A6.c.z(!this.f40431a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }
}
