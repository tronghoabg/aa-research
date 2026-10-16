package androidx.webkit.internal;

import androidx.webkit.UserAgentMetadata;
import androidx.webkit.WebViewMediaIntegrityApiStatusConfig;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class WebSettingsAdapter {
    private final WebSettingsBoundaryInterface mBoundaryInterface;

    public WebSettingsAdapter(WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.mBoundaryInterface = webSettingsBoundaryInterface;
    }

    public int getAttributionRegistrationBehavior() {
        return this.mBoundaryInterface.getAttributionBehavior();
    }

    public boolean getBackForwardCacheEnabled() {
        return this.mBoundaryInterface.getBackForwardCacheEnabled();
    }

    public boolean getBackForwardCacheKeepForwardEntries() {
        return this.mBoundaryInterface.getBackForwardCacheSettingsKeepForwardEntries();
    }

    public int getBackForwardCacheMaxPagesInCache() {
        return this.mBoundaryInterface.getBackForwardCacheSettingsMaxPagesInCache();
    }

    public long getBackForwardCacheTimeoutSeconds() {
        return this.mBoundaryInterface.getBackForwardCacheSettingsTimeout();
    }

    public boolean getCookieAccessForShouldInterceptRequestEnabled() {
        return this.mBoundaryInterface.getIncludeCookiesOnIntercept();
    }

    public int getDisabledActionModeMenuItems() {
        return this.mBoundaryInterface.getDisabledActionModeMenuItems();
    }

    public boolean getDownloadFaviconsEnabled() {
        return this.mBoundaryInterface.getDownloadFaviconsEnabled();
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.mBoundaryInterface.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public int getForceDark() {
        return this.mBoundaryInterface.getForceDark();
    }

    public int getForceDarkStrategy() {
        return this.mBoundaryInterface.getForceDarkBehavior();
    }

    public boolean getHasEnrolledInstrumentEnabled() {
        return this.mBoundaryInterface.getHasEnrolledInstrumentEnabled();
    }

    public boolean getOffscreenPreRaster() {
        return this.mBoundaryInterface.getOffscreenPreRaster();
    }

    public boolean getPaymentRequestEnabled() {
        return this.mBoundaryInterface.getPaymentRequestEnabled();
    }

    public boolean getSafeBrowsingEnabled() {
        return this.mBoundaryInterface.getSafeBrowsingEnabled();
    }

    public int getSpeculativeLoadingStatus() {
        return this.mBoundaryInterface.getSpeculativeLoadingStatus();
    }

    public UserAgentMetadata getUserAgentMetadata() {
        return UserAgentMetadataInternal.getUserAgentMetadataFromMap(this.mBoundaryInterface.getUserAgentMetadataMap());
    }

    public int getWebAuthenticationSupport() {
        return this.mBoundaryInterface.getWebauthnSupport();
    }

    public WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        WebViewMediaIntegrityApiStatusConfig.Builder builder = new WebViewMediaIntegrityApiStatusConfig.Builder(this.mBoundaryInterface.getWebViewMediaIntegrityApiDefaultStatus());
        builder.setOverrideRules(this.mBoundaryInterface.getWebViewMediaIntegrityApiOverrideRules());
        return builder.build();
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.mBoundaryInterface.isAlgorithmicDarkeningAllowed();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z) {
        this.mBoundaryInterface.setAlgorithmicDarkeningAllowed(z);
    }

    public void setAttributionRegistrationBehavior(int i2) {
        this.mBoundaryInterface.setAttributionBehavior(i2);
    }

    public void setBackForwardCacheEnabled(boolean z) {
        this.mBoundaryInterface.setBackForwardCacheEnabled(z);
    }

    public void setBackForwardCacheKeepForwardEntries(boolean z) {
        this.mBoundaryInterface.setBackForwardCacheSettingsKeepForwardEntries(z);
    }

    public void setBackForwardCacheMaxPagesInCache(int i2) {
        this.mBoundaryInterface.setBackForwardCacheSettingsMaxPagesInCache(i2);
    }

    public void setBackForwardCacheTimeoutSeconds(long j2) {
        this.mBoundaryInterface.setBackForwardCacheSettingsTimeout(j2);
    }

    public void setCookieAccessForShouldInterceptRequestEnabled(boolean z) {
        this.mBoundaryInterface.setIncludeCookiesOnIntercept(z);
    }

    public void setDisabledActionModeMenuItems(int i2) {
        this.mBoundaryInterface.setDisabledActionModeMenuItems(i2);
    }

    public void setDownloadFaviconsEnabled(boolean z) {
        this.mBoundaryInterface.setDownloadFaviconsEnabled(z);
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z) {
        this.mBoundaryInterface.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public void setForceDark(int i2) {
        this.mBoundaryInterface.setForceDark(i2);
    }

    public void setForceDarkStrategy(int i2) {
        this.mBoundaryInterface.setForceDarkBehavior(i2);
    }

    public void setHasEnrolledInstrumentEnabled(boolean z) {
        this.mBoundaryInterface.setHasEnrolledInstrumentEnabled(z);
    }

    public void setHyperlinkContextMenuItems(int i2) {
        this.mBoundaryInterface.setHyperlinkContextMenuItems(i2);
    }

    public void setOffscreenPreRaster(boolean z) {
        this.mBoundaryInterface.setOffscreenPreRaster(z);
    }

    public void setPaymentRequestEnabled(boolean z) {
        this.mBoundaryInterface.setPaymentRequestEnabled(z);
    }

    public void setSafeBrowsingEnabled(boolean z) {
        this.mBoundaryInterface.setSafeBrowsingEnabled(z);
    }

    public void setSpeculativeLoadingStatus(int i2) {
        this.mBoundaryInterface.setSpeculativeLoadingStatus(i2);
    }

    public void setUserAgentMetadata(UserAgentMetadata userAgentMetadata) {
        this.mBoundaryInterface.setUserAgentMetadataFromMap(UserAgentMetadataInternal.convertUserAgentMetadataToMap(userAgentMetadata));
    }

    public void setWebAuthenticationSupport(int i2) {
        this.mBoundaryInterface.setWebauthnSupport(i2);
    }

    public void setWebViewMediaIntegrityApiStatus(WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        this.mBoundaryInterface.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig.getDefaultStatus(), webViewMediaIntegrityApiStatusConfig.getOverrideRules());
    }
}
