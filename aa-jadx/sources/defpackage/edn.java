package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class edn {
    public final android.view.accessibility.AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    public edn(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private final java.util.List ac(java.lang.String str) {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        java.util.ArrayList<java.lang.Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private final boolean ad(int i) {
        android.os.Bundle bundleA = a();
        return bundleA != null && (bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public static defpackage.edn b() {
        return new defpackage.edn(android.view.accessibility.AccessibilityNodeInfo.obtain());
    }

    static java.lang.String f(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case android.R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case android.R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void A(boolean z) {
        this.a.setFocused(z);
    }

    public final void B(boolean z) {
        this.a.setHeading(z);
    }

    public final void C(java.lang.CharSequence charSequence) {
        this.a.setHintText(charSequence);
    }

    public final void D(boolean z) {
        this.a.setLongClickable(z);
    }

    public final void E(int i) {
        this.a.setMaxTextLength(i);
    }

    public final void F(int i) {
        this.a.setMovementGranularities(i);
    }

    public final void G(java.lang.CharSequence charSequence) {
        this.a.setPackageName(charSequence);
    }

    public final void H(java.lang.CharSequence charSequence) {
        this.a.setPaneTitle(charSequence);
    }

    public final void I(android.view.View view) {
        this.b = -1;
        this.a.setParent(view);
    }

    public final void J(android.view.View view, int i) {
        this.b = i;
        this.a.setParent(view, i);
    }

    public final void K(java.lang.CharSequence charSequence) {
        this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public final void L(boolean z) {
        this.a.setScreenReaderFocusable(z);
    }

    public final void M(boolean z) {
        this.a.setScrollable(z);
    }

    public final void N(boolean z) {
        this.a.setShowingHintText(z);
    }

    public final void O(android.view.View view, int i) {
        this.c = i;
        this.a.setSource(view, i);
    }

    public final void P(java.lang.CharSequence charSequence) {
        int i = android.os.Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 30) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void Q(java.lang.CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public final void R(android.view.View view) {
        this.a.setTraversalAfter(view);
    }

    public final void S(android.view.View view) {
        this.a.setTraversalBefore(view);
    }

    public final void T(android.view.View view, int i) {
        this.a.setTraversalBefore(view, i);
    }

    public final void U(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final boolean V() {
        return this.a.isClickable();
    }

    public final boolean W() {
        return this.a.isEnabled();
    }

    public final boolean X() {
        return this.a.isFocusable();
    }

    public final boolean Y() {
        return this.a.isFocused();
    }

    public final boolean Z() {
        return this.a.isPassword();
    }

    public final android.os.Bundle a() {
        return this.a.getExtras();
    }

    public final boolean aa() {
        return this.a.isScrollable();
    }

    public final void ab(defpackage.edm edmVar) {
        this.a.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) edmVar.p);
    }

    public final java.lang.CharSequence c() {
        return this.a.getClassName();
    }

    public final java.lang.CharSequence d() {
        return this.a.getContentDescription();
    }

    public final java.lang.CharSequence e() {
        if (ac("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            return this.a.getText();
        }
        java.util.List listAc = ac("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        java.util.List listAc2 = ac("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        java.util.List listAc3 = ac("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        java.util.List listAc4 = ac("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < listAc.size(); i++) {
            spannableString.setSpan(new defpackage.edl(((java.lang.Integer) listAc4.get(i)).intValue(), this, a().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((java.lang.Integer) listAc.get(i)).intValue(), ((java.lang.Integer) listAc2.get(i)).intValue(), ((java.lang.Integer) listAc3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.edn)) {
            return false;
        }
        defpackage.edn ednVar = (defpackage.edn) obj;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (ednVar.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(ednVar.a)) {
            return false;
        }
        return this.c == ednVar.c && this.b == ednVar.b;
    }

    public final void g(int i) {
        this.a.addAction(i);
    }

    public final void h(defpackage.edm edmVar) {
        this.a.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) edmVar.p);
    }

    public final int hashCode() {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(android.view.View view, int i) {
        this.a.addChild(view, i);
    }

    @java.lang.Deprecated
    public final void j(android.graphics.Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void k(android.graphics.Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void l(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void m(int i, boolean z) {
        android.os.Bundle bundleA = a();
        if (bundleA != null) {
            int i2 = bundleA.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (true != z) {
                i = 0;
            }
            bundleA.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @java.lang.Deprecated
    public final void n(android.graphics.Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void o(android.graphics.Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void p(boolean z) {
        this.a.setCheckable(z);
    }

    @java.lang.Deprecated
    public final void q(boolean z) {
        this.a.setChecked(z);
    }

    public final void r(java.lang.CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final void s(boolean z) {
        this.a.setClickable(z);
    }

    public final void t(java.lang.Object obj) {
        this.a.setCollectionInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) (obj == null ? null : ((defpackage.erh) obj).a));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        j(rect);
        rect.toString();
        sb.append("; boundsInParent: ".concat(rect.toString()));
        k(rect);
        rect.toString();
        sb.append("; boundsInScreen: ".concat(rect.toString()));
        int i = android.os.Build.VERSION.SDK_INT;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (i >= 34) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        } else {
            android.graphics.Rect rect2 = (android.graphics.Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        rect.toString();
        sb.append("; boundsInWindow: ".concat(rect.toString()));
        sb.append("; packageName: ");
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = this.a;
        sb.append(accessibilityNodeInfo2.getPackageName());
        sb.append("; className: ");
        sb.append(c());
        sb.append("; text: ");
        sb.append(e());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo2.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo2.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 30 ? accessibilityNodeInfo2.getStateDescription() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(d());
        sb.append("; supplementalDescription: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getSupplementalDescription() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(accessibilityNodeInfo2.getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo2.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo2.getUniqueId() : accessibilityNodeInfo2.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo2.isCheckable());
        sb.append("; checked: ");
        int checked = android.os.Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getChecked() : accessibilityNodeInfo2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo2.isChecked() ? 1 : 0);
        java.lang.String str = "PARTIAL";
        sb.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.isFieldRequired() : accessibilityNodeInfo2.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(X());
        sb.append("; focused: ");
        sb.append(Y());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo2.isSelected());
        sb.append("; clickable: ");
        sb.append(V());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo2.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo2.isContextClickable());
        sb.append("; expandedState: ");
        int expandedState = android.os.Build.VERSION.SDK_INT >= 36 ? accessibilityNodeInfo2.getExpandedState() : accessibilityNodeInfo2.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (expandedState == 0) {
            str = "UNDEFINED";
        } else if (expandedState == 1) {
            str = "COLLAPSED";
        } else if (expandedState != 2) {
            str = expandedState != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(W());
        sb.append("; password: ");
        sb.append(Z());
        sb.append("; scrollable: " + aa());
        sb.append("; containerTitle: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo2.getContainerTitle() : accessibilityNodeInfo2.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(ad(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo2.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo2.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 33 ? accessibilityNodeInfo2.isTextSelectable() : ad(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(android.os.Build.VERSION.SDK_INT >= 34 ? accessibilityNodeInfo2.isAccessibilityDataSensitive() : ad(64));
        sb.append("; [");
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo2.getActionList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.edm(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            defpackage.edm edmVar = (defpackage.edm) arrayList.get(i3);
            java.lang.String strF = f(edmVar.a());
            if (strF.equals("ACTION_UNKNOWN") && edmVar.b() != null) {
                strF = edmVar.b().toString();
            }
            sb.append(strF);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(java.lang.Object obj) {
        this.a.setCollectionItemInfo((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) ((defpackage.erh) obj).a);
    }

    public final void v(java.lang.CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void w(boolean z) {
        this.a.setDismissable(z);
    }

    public final void x(boolean z) {
        this.a.setEnabled(z);
    }

    public final void y(java.lang.CharSequence charSequence) {
        this.a.setError(charSequence);
    }

    public final void z(boolean z) {
        this.a.setFocusable(z);
    }
}
