package com.waze.uid;

import android.content.Context;
import android.content.Intent;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am implements com.waze.uid.d.s {
    @Override // com.waze.uid.d.s
    public final Intent a(Context context, com.waze.uid.d.r rVar, String str) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(rVar, "config");
        h.g.b.x.f(str, "url");
        Intent intent = new Intent(context, (Class<?>) SimpleWebActivity.class);
        intent.putExtra("webViewURL", str);
        intent.putExtra("webViewTitle", rVar.a());
        intent.putExtra("webViewShowClose", rVar.b());
        return intent;
    }
}
