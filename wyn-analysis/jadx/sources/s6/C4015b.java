package s6;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s6.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4015b extends View implements E {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f45121a;

    /* renamed from: b, reason: collision with root package name */
    public List f45122b;

    /* renamed from: c, reason: collision with root package name */
    public float f45123c;

    /* renamed from: d, reason: collision with root package name */
    public C4016c f45124d;

    /* renamed from: e, reason: collision with root package name */
    public float f45125e;

    public C4015b(Context context) {
        super(context, null);
        this.f45121a = new ArrayList();
        this.f45122b = Collections.EMPTY_LIST;
        this.f45123c = 0.0533f;
        this.f45124d = C4016c.f45126g;
        this.f45125e = 0.08f;
    }

    @Override // s6.E
    public final void a(List list, C4016c c4016c, float f10, float f11) {
        this.f45122b = list;
        this.f45124d = c4016c;
        this.f45123c = f10;
        this.f45125e = f11;
        while (true) {
            ArrayList arrayList = this.f45121a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new D(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x046c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.C4015b.dispatchDraw(android.graphics.Canvas):void");
    }
}
