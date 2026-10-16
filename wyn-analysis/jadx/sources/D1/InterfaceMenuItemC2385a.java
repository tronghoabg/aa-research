package d1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p.n;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceMenuItemC2385a extends MenuItem {
    n a();

    InterfaceMenuItemC2385a b(n nVar);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c10, int i5);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2385a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c10, int i5);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c10, char c11, int i5, int i10);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2385a setTooltipText(CharSequence charSequence);
}
