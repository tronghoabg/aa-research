package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.GridTemplate;
import defpackage.gjx;
import defpackage.gjy;
import defpackage.rb;
import defpackage.wb;

@Deprecated
@rb
/* loaded from: classes2.dex */
public final class GridWrapperTemplate implements wb {
    private final CarIcon backgroundImage;
    private final GridTemplate gridTemplate;
    private final boolean isLauncher;

    private GridWrapperTemplate(gjx gjxVar) {
        this.gridTemplate = gjxVar.a;
        this.backgroundImage = gjxVar.b;
        this.isLauncher = gjxVar.c;
    }

    public CarIcon getBackgroundImage() {
        return this.backgroundImage;
    }

    public GridTemplate getTemplate() {
        GridTemplate gridTemplate = this.gridTemplate;
        gridTemplate.getClass();
        return gridTemplate;
    }

    public boolean isLauncher() {
        return this.isLauncher;
    }

    public /* synthetic */ GridWrapperTemplate(gjx gjxVar, gjy gjyVar) {
        this(gjxVar);
    }

    private GridWrapperTemplate() {
        this.gridTemplate = null;
        this.backgroundImage = null;
        this.isLauncher = false;
    }
}
