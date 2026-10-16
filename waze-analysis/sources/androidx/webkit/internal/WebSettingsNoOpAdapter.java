package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebSettingsNoOpAdapter extends WebSettingsAdapter {
    public WebSettingsNoOpAdapter() {
        super(null);
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getAttributionRegistrationBehavior() {
        return 1;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getBackForwardCacheEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getBackForwardCacheKeepForwardEntries() {
        return true;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getBackForwardCacheMaxPagesInCache() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public long getBackForwardCacheTimeoutSeconds() {
        return 0L;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getCookieAccessForShouldInterceptRequestEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getDisabledActionModeMenuItems() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getDownloadFaviconsEnabled() {
        return true;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getForceDark() {
        return 1;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getForceDarkStrategy() {
        return 2;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getHasEnrolledInstrumentEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getOffscreenPreRaster() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getPaymentRequestEnabled() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean getSafeBrowsingEnabled() {
        return true;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getSpeculativeLoadingStatus() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(Collections.EMPTY_MAP);
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public int getWebAuthenticationSupport() {
        return 0;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new WebViewMediaIntegrityApiStatusConfig.Builder(2).build();
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public boolean isAlgorithmicDarkeningAllowed() {
        return false;
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setAlgorithmicDarkeningAllowed(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setAttributionRegistrationBehavior(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setBackForwardCacheEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setBackForwardCacheKeepForwardEntries(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setBackForwardCacheMaxPagesInCache(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setBackForwardCacheTimeoutSeconds(long j2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setCookieAccessForShouldInterceptRequestEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setDisabledActionModeMenuItems(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setDownloadFaviconsEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setForceDark(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setForceDarkStrategy(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setHasEnrolledInstrumentEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setHyperlinkContextMenuItems(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setOffscreenPreRaster(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setPaymentRequestEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setSafeBrowsingEnabled(boolean z) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setSpeculativeLoadingStatus(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setUserAgentMetadata(UserAgentMetadata userAgentMetadata) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setWebAuthenticationSupport(int i2) {
    }

    @Override // androidx.webkit.internal.WebSettingsAdapter
    public void setWebViewMediaIntegrityApiStatus(WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
    }
}
