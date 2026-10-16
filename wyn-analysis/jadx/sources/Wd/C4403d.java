package wd;

import Cd.G;
import Nd.i;
import com.moloco.sdk.internal.publisher.C1915d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC3340k;
import qf.j;
import tf.l;

/* renamed from: wd.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4403d {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f47475a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f47476b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f47477c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final C1915d f47478d = new C1915d(29);

    /* renamed from: e, reason: collision with root package name */
    public boolean f47479e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47480f = true;

    public C4403d() {
        int i5 = i.f8668a;
    }

    public final void a(G plugin, l lVar) {
        AbstractC3340k.e(plugin, "plugin");
        LinkedHashMap linkedHashMap = this.f47476b;
        linkedHashMap.put(plugin.getKey(), new Ff.d(9, (l) linkedHashMap.get(plugin.getKey()), lVar));
        LinkedHashMap linkedHashMap2 = this.f47475a;
        if (linkedHashMap2.containsKey(plugin.getKey())) {
            return;
        }
        linkedHashMap2.put(plugin.getKey(), new j(plugin, 1));
    }
}
