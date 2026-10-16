package com.android.car.libraries.apphost.internal.model;

import androidx.car.app.model.Action;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gmk;
import defpackage.gml;
import defpackage.rb;
import defpackage.wb;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000B\t\b\u0012¢\u0006\u0004\b\f\u0010\u000eJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0082\u0004J\n\u0010!\u001a\u00020\"H\u0096\u0080\u0004R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0007X\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/android/car/libraries/apphost/internal/model/AlphaJumpTemplate;", "Landroidx/car/app/model/Template;", "state", "Lcom/android/car/libraries/apphost/internal/model/AlphaJumpTemplate$State;", "listTemplate", "Lcom/android/car/libraries/apphost/internal/model/GoogleListTemplate;", "alphaJumpAction", "Landroidx/car/app/model/Action;", "keyboardActions", "", "jumpKey", "", "<init>", "(Lcom/android/car/libraries/apphost/internal/model/AlphaJumpTemplate$State;Lcom/android/car/libraries/apphost/internal/model/GoogleListTemplate;Landroidx/car/app/model/Action;Ljava/util/List;Ljava/lang/String;)V", "()V", "value", "getState", "()Lcom/android/car/libraries/apphost/internal/model/AlphaJumpTemplate$State;", "getListTemplate", "()Lcom/android/car/libraries/apphost/internal/model/GoogleListTemplate;", "getAlphaJumpAction", "()Landroidx/car/app/model/Action;", "getKeyboardActions", "()Ljava/util/List;", "getJumpKey", "()Ljava/lang/String;", "copy", "toBuilder", "Lcom/android/car/libraries/apphost/internal/model/AlphaJumpTemplate$Builder;", "equals", "", "other", "", "hashCode", "", "State", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.internal.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class AlphaJumpTemplate implements wb {
    private Action alphaJumpAction;
    private String jumpKey;
    private List<Action> keyboardActions;
    private GoogleListTemplate listTemplate;
    private gml state;

    public AlphaJumpTemplate(gml gmlVar, GoogleListTemplate googleListTemplate, Action action, List<Action> list, String str) {
        gmlVar.getClass();
        googleListTemplate.getClass();
        action.getClass();
        list.getClass();
        this.listTemplate = googleListTemplate;
        this.alphaJumpAction = action;
        this.keyboardActions = list;
        this.jumpKey = str;
        this.state = gmlVar;
    }

    public static /* synthetic */ AlphaJumpTemplate copy$default(AlphaJumpTemplate alphaJumpTemplate, gml gmlVar, GoogleListTemplate googleListTemplate, Action action, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            gmlVar = alphaJumpTemplate.getState();
        }
        if ((i & 2) != 0) {
            googleListTemplate = alphaJumpTemplate.getListTemplate();
        }
        if ((i & 4) != 0) {
            action = alphaJumpTemplate.getAlphaJumpAction();
        }
        if ((i & 8) != 0) {
            list = alphaJumpTemplate.getKeyboardActions();
        }
        if ((i & 16) != 0) {
            str = alphaJumpTemplate.jumpKey;
        }
        String str2 = str;
        Action action2 = action;
        return alphaJumpTemplate.copy(gmlVar, googleListTemplate, action2, list, str2);
    }

    public final AlphaJumpTemplate copy(gml gmlVar, GoogleListTemplate googleListTemplate, Action action, List<Action> list, String str) {
        gmlVar.getClass();
        googleListTemplate.getClass();
        action.getClass();
        list.getClass();
        return new AlphaJumpTemplate(gmlVar, googleListTemplate, action, list, str);
    }

    public boolean equals(Object other) {
        if (!(other instanceof AlphaJumpTemplate)) {
            return false;
        }
        AlphaJumpTemplate alphaJumpTemplate = (AlphaJumpTemplate) other;
        return affa.f(alphaJumpTemplate.getListTemplate(), getListTemplate()) && affa.f(alphaJumpTemplate.getAlphaJumpAction(), getAlphaJumpAction()) && affa.f(alphaJumpTemplate.getKeyboardActions(), getKeyboardActions()) && affa.f(alphaJumpTemplate.jumpKey, this.jumpKey) && alphaJumpTemplate.getState() == getState();
    }

    public final Action getAlphaJumpAction() {
        Action action = this.alphaJumpAction;
        if (action != null) {
            return action;
        }
        affa.d("alphaJumpAction");
        return null;
    }

    public final String getJumpKey() {
        return this.jumpKey;
    }

    public final List<Action> getKeyboardActions() {
        List<Action> list = this.keyboardActions;
        if (list != null) {
            return list;
        }
        affa.d("keyboardActions");
        return null;
    }

    public final GoogleListTemplate getListTemplate() {
        GoogleListTemplate googleListTemplate = this.listTemplate;
        if (googleListTemplate != null) {
            return googleListTemplate;
        }
        affa.d("listTemplate");
        return null;
    }

    public final gml getState() {
        gml gmlVar = this.state;
        if (gmlVar != null) {
            return gmlVar;
        }
        affa.d("state");
        return null;
    }

    public int hashCode() {
        return Objects.hash(getListTemplate(), getAlphaJumpAction(), getKeyboardActions(), this.jumpKey, getState());
    }

    public final gmk toBuilder() {
        return new gmk(getState(), getListTemplate(), getAlphaJumpAction(), getKeyboardActions());
    }

    private AlphaJumpTemplate() {
    }

    public /* synthetic */ AlphaJumpTemplate(gml gmlVar, GoogleListTemplate googleListTemplate, Action action, List list, String str, int i, afeu afeuVar) {
        this(gmlVar, googleListTemplate, action, list, (i & 16) != 0 ? null : str);
    }
}
