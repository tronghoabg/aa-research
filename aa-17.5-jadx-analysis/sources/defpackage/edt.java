package defpackage;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes2.dex */
public final class edt extends InputConnectionWrapper {
    final /* synthetic */ ajmd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(InputConnection inputConnection, ajmd ajmdVar) {
        super(inputConnection, false);
        this.a = ajmdVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Bundle bundle2;
        erb erbVar = inputContentInfo == null ? null : new erb(new edu(inputContentInfo));
        ajmd ajmdVar = this.a;
        if ((i & 1) != 0) {
            try {
                ((edu) erbVar.a).a.requestPermission();
                InputContentInfo inputContentInfo2 = ((edu) erbVar.a).a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = ((edu) erbVar.a).a;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        dzr dzqVar = Build.VERSION.SDK_INT >= 31 ? new dzq(clipData, 2) : new dzs(clipData, 2);
        Object obj = ajmdVar.a;
        dzqVar.d(inputContentInfo3.getLinkUri());
        dzqVar.b(bundle2);
        if (ebm.c((View) obj, dzqVar.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
