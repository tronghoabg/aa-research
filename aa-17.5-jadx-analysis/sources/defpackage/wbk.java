package defpackage;

/* loaded from: classes3.dex */
public final class wbk implements aboe {
    private final /* synthetic */ int a;

    public wbk(int i) {
        this.a = i;
    }

    @Override // defpackage.aboe
    public final /* synthetic */ Object a(int i) {
        Object obj = null;
        switch (this.a) {
            case 0:
                zhp zhpVarB = zhp.b(i);
                return zhpVarB == null ? zhp.UNKNOWN : zhpVarB;
            case 1:
                taq taqVarB = taq.b(i);
                return taqVarB == null ? taq.KEY_UNKNOWN_SETTING : taqVarB;
            case 2:
                xge xgeVarB = xge.b(i);
                return xgeVarB == null ? xge.UNRECOGNIZED : xgeVarB;
            case 3:
                xgg xggVarB = xgg.b(i);
                return xggVarB == null ? xgg.UNRECOGNIZED : xggVarB;
            case 4:
                xgc xgcVarB = xgc.b(i);
                return xgcVarB == null ? xgc.UNRECOGNIZED : xgcVarB;
            case 5:
                xgf xgfVarB = xgf.b(i);
                return xgfVarB == null ? xgf.UNRECOGNIZED : xgfVarB;
            case 6:
                xgd xgdVarB = xgd.b(i);
                return xgdVarB == null ? xgd.UNRECOGNIZED : xgdVarB;
            case 7:
                xgh xghVarB = xgh.b(i);
                return xghVarB == null ? xgh.METADATA_UNKNOWN : xghVarB;
            case 8:
                xii xiiVarB = xii.b(i);
                return xiiVarB == null ? xii.CAR_LOCAL_MEDIA_PLAYBACK_PLAY : xiiVarB;
            case 9:
                xml xmlVarB = xml.b(i);
                return xmlVarB == null ? xml.RADIO_BAND_AM : xmlVarB;
            case 10:
                zkd zkdVarB = zkd.b(i);
                return zkdVarB == null ? zkd.UNKNOWN_CAMERA_SURFACE : zkdVarB;
            case 11:
                accb accbVarB = accb.b(i);
                return accbVarB == null ? accb.UNKNOWN_REQUEST_ID : accbVarB;
            case 12:
                aavb aavbVarB = aavb.b(i);
                return aavbVarB == null ? aavb.UNKNOWN_SDK_MAP_VARIANT : aavbVarB;
            case 13:
                abaf abafVarB = abaf.b(i);
                return abafVarB == null ? abaf.CENTER : abafVarB;
            case 14:
                if (i == 0) {
                    obj = abxt.COMPLETION_STYLE_UNKNOWN;
                } else if (i == 1) {
                    obj = abxt.COMPLETION_STYLE_CARD;
                } else if (i == 2) {
                    obj = abxt.COMPLETION_STYLE_TOAST;
                }
                return obj == null ? abxt.UNRECOGNIZED : obj;
            case 15:
                if (i == 0) {
                    obj = abxw.PROMPT_STYLE_UNKNOWN;
                } else if (i == 1) {
                    obj = abxw.PROMPT_STYLE_FIRST_CARD_NON_MODAL;
                } else if (i == 2) {
                    obj = abxw.PROMPT_STYLE_FIRST_CARD_MODAL;
                }
                return obj == null ? abxw.UNRECOGNIZED : obj;
            case 16:
                abgl abglVarB = abgl.b(i);
                return abglVarB == null ? abgl.UNKNOWN : abglVarB;
            default:
                abgl abglVarB2 = abgl.b(i);
                return abglVarB2 == null ? abgl.UNKNOWN : abglVarB2;
        }
    }
}
