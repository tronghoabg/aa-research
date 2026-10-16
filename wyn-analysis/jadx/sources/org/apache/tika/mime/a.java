package org.apache.tika.mime;

import j$.util.function.Consumer$CC;
import java.net.URL;
import java.util.function.Consumer;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42939a;

    public /* synthetic */ a(int i5) {
        this.f42939a = i5;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f42939a) {
            case 0:
                MimeTypesFactory.lambda$create$0((URL) obj);
                break;
            case 1:
                ((Process) obj).destroyForcibly();
                break;
            default:
                ((Process) obj).destroyForcibly();
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i5 = this.f42939a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
