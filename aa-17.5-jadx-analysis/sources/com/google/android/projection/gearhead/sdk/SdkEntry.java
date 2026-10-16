package com.google.android.projection.gearhead.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import defpackage.xeq;
import defpackage.yph;

/* loaded from: classes3.dex */
public class SdkEntry {
    static {
        yph.c("GH.SdkEntry");
    }

    public SdkEntry(Context context, Context context2) {
        new xeq();
        throw new IllegalStateException("Projection SDK in use");
    }

    public void cleanup() {
        throw null;
    }

    public void closeDrawer() {
        throw null;
    }

    public void enableDrawerAlphaJump() {
        throw null;
    }

    public void enableDrawerUnlimitedBrowse() {
        throw null;
    }

    public View getContentView() {
        throw null;
    }

    public View getContentView2(int i) {
        throw null;
    }

    public int getFragmentContainerId() {
        throw null;
    }

    public View getKeyboardSearchView() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    public void hideAppHeader() {
        throw null;
    }

    public void hideMenuButton() {
        throw null;
    }

    public void hideMicButton() {
        throw null;
    }

    public void hideStatusViews() {
        throw null;
    }

    public void init(boolean z) {
        throw null;
    }

    public void makeSearchBoxFocusable() {
        throw null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        throw null;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        throw null;
    }

    public void onResume() {
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        throw null;
    }

    public void onStart() {
        throw null;
    }

    public void onStop() {
        throw null;
    }

    public void openDrawer() {
        throw null;
    }

    public void restoreMenuButtonDrawable() {
        throw null;
    }

    public void setAutoLightDarkMode() {
        throw null;
    }

    public void setBackground(Bitmap bitmap) {
        throw null;
    }

    public void setBackgroundResource(int i) {
        throw null;
    }

    public void setCarMenuBinder(IBinder iBinder) throws RemoteException {
        throw null;
    }

    public void setDarkMode() {
        throw null;
    }

    public void setHideClock(boolean z) {
        throw null;
    }

    public void setLightMode() {
        throw null;
    }

    public void setMenuButtonBitmap(Bitmap bitmap) {
        throw null;
    }

    public void setMicButtonColor(int i) {
        throw null;
    }

    @Deprecated
    public void setRestartedFromDayNightMode(boolean z) {
        throw null;
    }

    public void setScrimColor(int i) {
        throw null;
    }

    public void setSearchBoxColors(int i, int i2, int i3, int i4) {
        throw null;
    }

    public void setSearchBoxEditListener(IBinder iBinder) {
        throw null;
    }

    public void setSearchBoxEndView(View view) {
        throw null;
    }

    public void setSearchManager(IBinder iBinder) {
        throw null;
    }

    public void setTitle(CharSequence charSequence) {
        throw null;
    }

    public void setXRayMode(boolean z) {
        throw null;
    }

    public void showAppHeader() {
        throw null;
    }

    public void showMenu(String str, String str2) {
        throw null;
    }

    public void showMenuButton() {
        throw null;
    }

    public void showMicButton() {
        throw null;
    }

    public void showSearchBox(View.OnClickListener onClickListener) {
        throw null;
    }

    public void showStatusViews() {
        throw null;
    }

    public void startCarActivity(Intent intent) {
        throw null;
    }

    public InputConnection startInput(EditorInfo editorInfo, String str, View.OnClickListener onClickListener) {
        throw null;
    }

    public void stopInput() {
        throw null;
    }
}
