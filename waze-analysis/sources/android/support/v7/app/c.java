package android.support.v7.app;

import android.os.Message;
import android.view.View;
import android.widget.Button;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f576a;

    c(j jVar) {
        this.f576a = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        j jVar = this.f576a;
        if (view == jVar.f599c && (message2 = jVar.f600d) != null) {
            messageObtain = Message.obtain(message2);
        } else if (view != jVar.f601e || (message = jVar.f602f) == null) {
            Button button = jVar.f603g;
            messageObtain = null;
        } else {
            messageObtain = Message.obtain(message);
        }
        if (messageObtain != null) {
            messageObtain.sendToTarget();
        }
        jVar.o.obtainMessage(1, jVar.f597a).sendToTarget();
    }
}
