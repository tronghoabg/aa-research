package com.qonversion.android.sdk.automations.mvp;

import android.webkit.WebView;
import com.qonversion.android.sdk.databinding.QFragmentScreenBinding;
import ef.C2515C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import org.jetbrains.annotations.NotNull;
import tf.l;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "macrosHtml", "Lef/C;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ScreenFragment$loadWebView$1$1 extends AbstractC3343n implements l {
    final /* synthetic */ ScreenFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenFragment$loadWebView$1$1(ScreenFragment screenFragment) {
        super(1);
        this.this$0 = screenFragment;
    }

    @Override // tf.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C2515C.f34653a;
    }

    public final void invoke(@NotNull String macrosHtml) {
        WebView webView;
        AbstractC3340k.e(macrosHtml, "macrosHtml");
        QFragmentScreenBinding qFragmentScreenBinding = this.this$0.binding;
        if (qFragmentScreenBinding == null || (webView = qFragmentScreenBinding.webView) == null) {
            return;
        }
        webView.loadDataWithBaseURL(null, macrosHtml, "text/html", "UTF-8", null);
    }
}
