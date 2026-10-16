package Ke;

import java.io.PrintStream;
import java.io.PrintWriter;
import ka.AbstractC3230e0;

/* loaded from: classes5.dex */
public final class a extends AbstractC3230e0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6784i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f6785j;

    public /* synthetic */ a(Object obj, int i5) {
        this.f6784i = i5;
        this.f6785j = obj;
    }

    @Override // ka.AbstractC3230e0
    public final void v(String str) {
        switch (this.f6784i) {
            case 0:
                ((PrintStream) this.f6785j).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f6785j).println((Object) str);
                break;
        }
    }
}
