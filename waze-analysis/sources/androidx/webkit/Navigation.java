package androidx.webkit;

import androidx.webkit.internal.WebResourceErrorImpl;
import androidx.webkit.internal.WebViewFeatureInternal;
import j$.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewNavigationBoundaryInterface;
import org.chromium.support_lib_boundary.a.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class Navigation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final WebViewNavigationBoundaryInterface mNavigationImpl;
    Page mPage;

    private Navigation(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) {
        this.mNavigationImpl = webViewNavigationBoundaryInterface;
    }

    public static Navigation forInvocationHandler(InvocationHandler invocationHandler) {
        final WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface = (WebViewNavigationBoundaryInterface) b.a(WebViewNavigationBoundaryInterface.class, invocationHandler);
        return (Navigation) Objects.requireNonNull(webViewNavigationBoundaryInterface.getOrCreatePeer(new Callable() { // from class: androidx.webkit.Navigation$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Navigation.lambda$forInvocationHandler$0(webViewNavigationBoundaryInterface);
            }
        }));
    }

    static /* synthetic */ Object lambda$forInvocationHandler$0(WebViewNavigationBoundaryInterface webViewNavigationBoundaryInterface) {
        return new Navigation(webViewNavigationBoundaryInterface);
    }

    public boolean didCommit() {
        return this.mNavigationImpl.didCommit();
    }

    public boolean didCommitErrorPage() {
        return this.mNavigationImpl.didCommitErrorPage();
    }

    public Page getPage() {
        if (this.mNavigationImpl.getPage() == null) {
            return null;
        }
        Page page = this.mPage;
        if (page != null) {
            return page;
        }
        Page pageForInvocationHandler = Page.forInvocationHandler(this.mNavigationImpl.getPage());
        this.mPage = pageForInvocationHandler;
        return pageForInvocationHandler;
    }

    public int getStatusCode() {
        return this.mNavigationImpl.getStatusCode();
    }

    public String getUrl() {
        return this.mNavigationImpl.getUrl();
    }

    public WebResourceErrorCompat getWebResourceError() {
        if (!WebViewFeatureInternal.NAVIGATION_GET_WEB_RESOURCE_ERROR.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (this.mNavigationImpl.getWebResourceError() == null) {
            return null;
        }
        return new WebResourceErrorImpl(this.mNavigationImpl.getWebResourceError());
    }

    public boolean isBack() {
        return this.mNavigationImpl.isBack();
    }

    public boolean isForward() {
        return this.mNavigationImpl.isForward();
    }

    public boolean isHistory() {
        return this.mNavigationImpl.isHistory();
    }

    public boolean isReload() {
        return this.mNavigationImpl.isReload();
    }

    public boolean isRestore() {
        return this.mNavigationImpl.isRestore();
    }

    public boolean isSameDocument() {
        return this.mNavigationImpl.isSameDocument();
    }

    public boolean wasInitiatedByPage() {
        return this.mNavigationImpl.wasInitiatedByPage();
    }
}
