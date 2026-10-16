package zg;

import j$.util.Optional;
import okhttp3.ResponseBody;

/* renamed from: zg.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4684x implements InterfaceC4671j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f48655a;

    public /* synthetic */ C4684x(Object obj) {
        this.f48655a = obj;
    }

    @Override // zg.InterfaceC4671j
    public Object convert(Object obj) {
        return Optional.ofNullable(((InterfaceC4671j) this.f48655a).convert((ResponseBody) obj));
    }
}
