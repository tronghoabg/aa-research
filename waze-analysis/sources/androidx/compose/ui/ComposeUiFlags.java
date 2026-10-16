package androidx.compose.ui;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeUiFlags {
    public static boolean isClearNestedScrollCoroutineScopeFixEnabled;
    public static boolean isFocusRestorationEnabled;
    public static boolean isInitialFocusOnFocusableAvailable;
    public static boolean isMediaQueryIntegrationEnabled;
    public static boolean isViewFocusFixEnabled;
    public static final ComposeUiFlags INSTANCE = new ComposeUiFlags();
    public static boolean isBypassUnfocusableComposeViewEnabled = true;
    public static boolean isAccessibilityShouldIncludeOffscreenChildrenEnabled = true;
    public static boolean isSkipNonImportantSemanticsNodesHitTestEnabled = true;
    public static boolean isExploreByTouchHoverHandled = true;
    public static final int $stable = 8;

    private ComposeUiFlags() {
    }
}
