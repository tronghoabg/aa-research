package com.qonversion.android.sdk.automations.mvp;

import android.R;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.F;
import androidx.fragment.app.FragmentActivity;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QActionResultType;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.databinding.QFragmentScreenBinding;
import com.qonversion.android.sdk.databinding.QProgressBarBinding;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.internal.di.QDependencyInjector;
import com.qonversion.android.sdk.internal.di.component.DaggerFragmentComponent;
import com.qonversion.android.sdk.internal.di.module.FragmentModule;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import ef.C2515C;
import ef.C2527k;
import ef.InterfaceC2519c;
import ff.AbstractC2640A;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010\u0004J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b*\u0010)J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\nH\u0016¢\u0006\u0004\b,\u0010)J\u000f\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b-\u0010\u0004J\u0017\u0010.\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b0\u0010/J\u001f\u00103\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010=\u001a\u00020<8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010D\u001a\u00020C8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;", "Landroidx/fragment/app/F;", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "<init>", "()V", "Lef/C;", "configureWebClient", "injectDependencies", "loadWebView", "confirmScreenView", "", "value", "", "getActionResultMap", "(Ljava/lang/String;)Ljava/util/Map;", "functionName", "Lcom/qonversion/android/sdk/dto/QonversionError;", "error", "Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "actionResult", "handleOnErrorCallback", "(Ljava/lang/String;Lcom/qonversion/android/sdk/dto/QonversionError;Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "screenId", "htmlPage", "openScreen", "(Ljava/lang/String;Ljava/lang/String;)V", "url", "openLink", "(Ljava/lang/String;)V", "openDeepLink", InAppPurchaseMetaData.KEY_PRODUCT_ID, "purchase", "restore", "close", "(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V", "closeAll", "", "shouldCloseScreen", "onError", "(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "getAutomationsManager$sdk_release", "()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "setAutomationsManager$sdk_release", "(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V", "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "presenter", "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "getPresenter$sdk_release", "()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "setPresenter$sdk_release", "(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V", "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "screenProcessor", "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "getScreenProcessor$sdk_release", "()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "setScreenProcessor$sdk_release", "(Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V", "Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;", "binding", "Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ScreenFragment extends F implements ScreenContract.View {

    @NotNull
    private static final String ACTION_MAP_KEY = "value";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String ENCODING = "UTF-8";

    @NotNull
    private static final String EX_HTML_PAGE = "htmlPage";

    @NotNull
    private static final String EX_SCREEN_ID = "screenId";

    @NotNull
    private static final String MIME_TYPE = "text/html";
    public QAutomationsManager automationsManager;

    @Nullable
    private QFragmentScreenBinding binding;

    @NotNull
    private final ConsoleLogger logger = new ConsoleLogger();
    public ScreenPresenter presenter;
    public ScreenProcessor screenProcessor;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;", "", "()V", "ACTION_MAP_KEY", "", "ENCODING", "EX_HTML_PAGE", "EX_SCREEN_ID", "MIME_TYPE", "getArguments", "Landroid/os/Bundle;", "screenId", "htmlPage", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Bundle getArguments(@Nullable String screenId, @Nullable String htmlPage) {
            Bundle bundle = new Bundle();
            bundle.putString("screenId", screenId);
            bundle.putString("htmlPage", htmlPage);
            return bundle;
        }

        private Companion() {
        }
    }

    private final void configureWebClient() {
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        WebView webView = qFragmentScreenBinding != null ? qFragmentScreenBinding.webView : null;
        if (webView == null) {
            return;
        }
        webView.setWebViewClient(new WebViewClient() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment.configureWebClient.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@Nullable WebView view, @Nullable String url) {
                QProgressBarBinding qProgressBarBinding;
                QFragmentScreenBinding qFragmentScreenBinding2 = ScreenFragment.this.binding;
                ProgressBar progressBar = (qFragmentScreenBinding2 == null || (qProgressBarBinding = qFragmentScreenBinding2.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            @InterfaceC2519c
            public boolean shouldOverrideUrlLoading(@Nullable WebView view, @Nullable String url) {
                return ScreenFragment.this.getPresenter$sdk_release().shouldOverrideUrlLoading(url);
            }
        });
    }

    private final void confirmScreenView() {
        Bundle arguments = getArguments();
        C2515C c2515c = null;
        String string = arguments != null ? arguments.getString("screenId") : null;
        if (string != null) {
            getAutomationsManager$sdk_release().automationsDidShowScreen(string);
            getPresenter$sdk_release().confirmScreenView(string);
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            this.logger.debug("confirmScreenView() -> Failed to confirm screen view");
        }
    }

    private final Map<String, String> getActionResultMap(String value) {
        return AbstractC2640A.S(new C2527k("value", value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnErrorCallback(String functionName, QonversionError error, QActionResult actionResult) {
        QProgressBarBinding qProgressBarBinding;
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.logger.error("ScreenActivity " + functionName + " -> " + error + ".description");
        actionResult.setError(error);
        getAutomationsManager$sdk_release().automationsDidFailExecuting(actionResult);
    }

    private final void injectDependencies() {
        DaggerFragmentComponent.builder().appComponent(QDependencyInjector.INSTANCE.getAppComponent$sdk_release()).fragmentModule(new FragmentModule(this)).build().inject(this);
    }

    private final void loadWebView() {
        Bundle arguments = getArguments();
        C2515C c2515c = null;
        String string = arguments != null ? arguments.getString("htmlPage") : null;
        if (string != null) {
            getScreenProcessor$sdk_release().processScreen(string, new ScreenFragment$loadWebView$1$1(this), new ScreenFragment$loadWebView$1$2(this));
            c2515c = C2515C.f34653a;
        }
        if (c2515c == null) {
            this.logger.error("loadWebView() -> Failed to fetch html page for the app screen");
            onError(new QonversionError(QonversionErrorCode.Unknown, null, null, 6, null), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(boolean z2, ScreenFragment this$0, DialogInterface dialogInterface, int i5) {
        AbstractC3340k.e(this$0, "this$0");
        if (z2) {
            ScreenContract.View.DefaultImpls.close$default(this$0, null, 1, null);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void close(@NotNull QActionResult actionResult) {
        QProgressBarBinding qProgressBarBinding;
        AbstractC3340k.e(actionResult, "actionResult");
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        ScreenActivity screenActivity = activity instanceof ScreenActivity ? (ScreenActivity) activity : null;
        boolean zGoBack$sdk_release = screenActivity != null ? screenActivity.goBack$sdk_release() : false;
        getAutomationsManager$sdk_release().automationsDidFinishExecuting(actionResult);
        if (zGoBack$sdk_release) {
            getAutomationsManager$sdk_release().automationsFinished();
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void closeAll(@NotNull QActionResult actionResult) {
        QProgressBarBinding qProgressBarBinding;
        AbstractC3340k.e(actionResult, "actionResult");
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        getAutomationsManager$sdk_release().automationsDidFinishExecuting(actionResult);
        getAutomationsManager$sdk_release().automationsFinished();
    }

    @NotNull
    public final QAutomationsManager getAutomationsManager$sdk_release() {
        QAutomationsManager qAutomationsManager = this.automationsManager;
        if (qAutomationsManager != null) {
            return qAutomationsManager;
        }
        AbstractC3340k.m("automationsManager");
        throw null;
    }

    @NotNull
    public final ScreenPresenter getPresenter$sdk_release() {
        ScreenPresenter screenPresenter = this.presenter;
        if (screenPresenter != null) {
            return screenPresenter;
        }
        AbstractC3340k.m("presenter");
        throw null;
    }

    @NotNull
    public final ScreenProcessor getScreenProcessor$sdk_release() {
        ScreenProcessor screenProcessor = this.screenProcessor;
        if (screenProcessor != null) {
            return screenProcessor;
        }
        AbstractC3340k.m("screenProcessor");
        throw null;
    }

    @Override // androidx.fragment.app.F
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC3340k.e(inflater, "inflater");
        QFragmentScreenBinding qFragmentScreenBindingInflate = QFragmentScreenBinding.inflate(inflater, container, false);
        AbstractC3340k.d(qFragmentScreenBindingInflate, "inflate(...)");
        this.binding = qFragmentScreenBindingInflate;
        RelativeLayout root = qFragmentScreenBindingInflate.getRoot();
        AbstractC3340k.d(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.F
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void onError(@NotNull QonversionError error, final boolean shouldCloseScreen) {
        AbstractC3340k.e(error, "error");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Failed to show the in-app screen");
        builder.setMessage(error.getDescription());
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.qonversion.android.sdk.automations.mvp.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                ScreenFragment.onError$lambda$1(shouldCloseScreen, this, dialogInterface, i5);
            }
        });
        builder.show();
    }

    @Override // androidx.fragment.app.F
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AbstractC3340k.e(view, "view");
        injectDependencies();
        configureWebClient();
        loadWebView();
        confirmScreenView();
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void openDeepLink(@NotNull String url) {
        AbstractC3340k.e(url, "url");
        QActionResultType qActionResultType = QActionResultType.DeepLink;
        QActionResult qActionResult = new QActionResult(qActionResultType, getActionResultMap(url));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            close(new QActionResult(qActionResultType, getActionResultMap(url)));
        } catch (ActivityNotFoundException unused) {
            this.logger.error("Couldn't find any Activity to handle the Intent with deeplink ".concat(url));
            getAutomationsManager$sdk_release().automationsDidFailExecuting(qActionResult);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void openLink(@NotNull String url) {
        AbstractC3340k.e(url, "url");
        QActionResult qActionResult = new QActionResult(QActionResultType.Url, getActionResultMap(url));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            getAutomationsManager$sdk_release().automationsDidFinishExecuting(qActionResult);
        } catch (ActivityNotFoundException unused) {
            this.logger.error("Couldn't find any Activity to handle the Intent with url ".concat(url));
            getAutomationsManager$sdk_release().automationsDidFailExecuting(qActionResult);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void openScreen(@NotNull String screenId, @NotNull String htmlPage) {
        AbstractC3340k.e(screenId, "screenId");
        AbstractC3340k.e(htmlPage, "htmlPage");
        QActionResult qActionResult = new QActionResult(QActionResultType.Navigation, getActionResultMap(screenId));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        try {
            FragmentActivity activity = getActivity();
            AbstractC3340k.c(activity, "null cannot be cast to non-null type com.qonversion.android.sdk.automations.mvp.ScreenActivity");
            ScreenActivity.showScreen$sdk_release$default((ScreenActivity) activity, screenId, htmlPage, false, 4, null);
            getAutomationsManager$sdk_release().automationsDidFinishExecuting(qActionResult);
        } catch (Exception unused) {
            getAutomationsManager$sdk_release().automationsDidFailExecuting(qActionResult);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void purchase(@NotNull String productId) {
        QProgressBarBinding qProgressBarBinding;
        AbstractC3340k.e(productId, "productId");
        final QActionResult qActionResult = new QActionResult(QActionResultType.Purchase, getActionResultMap(productId));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Qonversion.INSTANCE.getSharedInstance().purchase(activity, new QPurchaseModel(productId, null, 2, null), new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$purchase$1$1
                @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
                public void onError(@NotNull QonversionError error) {
                    AbstractC3340k.e(error, "error");
                    ScreenFragment screenFragment = this.this$0;
                    new Object() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$purchase$1$1$onError$1
                    };
                    Method enclosingMethod = ScreenFragment$purchase$1$1$onError$1.class.getEnclosingMethod();
                    screenFragment.handleOnErrorCallback(enclosingMethod != null ? enclosingMethod.getName() : null, error, qActionResult);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
                public void onSuccess(@NotNull Map<String, QEntitlement> entitlements) {
                    AbstractC3340k.e(entitlements, "entitlements");
                    this.this$0.close(qActionResult);
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void restore() {
        QProgressBarBinding qProgressBarBinding;
        ProgressBar progressBar = null;
        final QActionResult qActionResult = new QActionResult(QActionResultType.Restore, null, 2, null);
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        if (qFragmentScreenBinding != null && (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) != null) {
            progressBar = qProgressBarBinding.progressBar;
        }
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        Qonversion.INSTANCE.getSharedInstance().restore(new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment.restore.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(@NotNull QonversionError error) {
                AbstractC3340k.e(error, "error");
                ScreenFragment screenFragment = ScreenFragment.this;
                new Object() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$restore$1$onError$1
                };
                Method enclosingMethod = ScreenFragment$restore$1$onError$1.class.getEnclosingMethod();
                screenFragment.handleOnErrorCallback(enclosingMethod != null ? enclosingMethod.getName() : null, error, qActionResult);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(@NotNull Map<String, QEntitlement> entitlements) {
                AbstractC3340k.e(entitlements, "entitlements");
                ScreenFragment.this.close(qActionResult);
            }
        });
    }

    public final void setAutomationsManager$sdk_release(@NotNull QAutomationsManager qAutomationsManager) {
        AbstractC3340k.e(qAutomationsManager, "<set-?>");
        this.automationsManager = qAutomationsManager;
    }

    public final void setPresenter$sdk_release(@NotNull ScreenPresenter screenPresenter) {
        AbstractC3340k.e(screenPresenter, "<set-?>");
        this.presenter = screenPresenter;
    }

    public final void setScreenProcessor$sdk_release(@NotNull ScreenProcessor screenProcessor) {
        AbstractC3340k.e(screenProcessor, "<set-?>");
        this.screenProcessor = screenProcessor;
    }
}
