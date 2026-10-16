package androidx.credentials.provider.utils;

import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.BeginGetCredentialRequest;
import android.service.credentials.BeginGetCredentialResponse;
import android.service.credentials.CallingAppInfo;
import androidx.credentials.provider.Action;
import androidx.credentials.provider.AuthenticationAction;
import androidx.credentials.provider.BeginGetCredentialOption;
import androidx.credentials.provider.CallingAppInfo;
import androidx.credentials.provider.CredentialEntry;
import androidx.credentials.provider.RemoteEntry;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import androidx.media3.datasource.HttpEngineDataSource$$ExternalSyntheticApiModelOutline0;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class BeginGetCredentialUtil {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        static final BeginGetCredentialOption convertToFrameworkRequest$lambda$0(androidx.credentials.provider.BeginGetCredentialOption beginGetCredentialOption) {
            Companion companion = BeginGetCredentialUtil.Companion;
            x.c(beginGetCredentialOption);
            return companion.convertToJetpackBeginOption(beginGetCredentialOption);
        }

        private final BeginGetCredentialOption convertToJetpackBeginOption(androidx.credentials.provider.BeginGetCredentialOption beginGetCredentialOption) {
            return new BeginGetCredentialOption(beginGetCredentialOption.getId(), beginGetCredentialOption.getType(), beginGetCredentialOption.getCandidateQueryData());
        }

        static final CredentialEntry convertToJetpackResponse$lambda$0(android.service.credentials.CredentialEntry credentialEntry) {
            CredentialEntry.Companion companion = CredentialEntry.Companion;
            Slice slice = credentialEntry.getSlice();
            x.e(slice, "getSlice(...)");
            return companion.fromSlice$credentials(slice);
        }

        static final CredentialEntry convertToJetpackResponse$lambda$1(l lVar, Object obj) {
            return (CredentialEntry) lVar.invoke(obj);
        }

        static final Action convertToJetpackResponse$lambda$10(Action action) {
            x.c(action);
            return action;
        }

        static final Action convertToJetpackResponse$lambda$11(l lVar, Object obj) {
            return (Action) lVar.invoke(obj);
        }

        static final AuthenticationAction convertToJetpackResponse$lambda$12(android.service.credentials.Action action) {
            AuthenticationAction.Companion companion = AuthenticationAction.Companion;
            Slice slice = action.getSlice();
            x.e(slice, "getSlice(...)");
            return companion.fromSlice(slice);
        }

        static final AuthenticationAction convertToJetpackResponse$lambda$13(l lVar, Object obj) {
            return (AuthenticationAction) lVar.invoke(obj);
        }

        static final boolean convertToJetpackResponse$lambda$14(AuthenticationAction authenticationAction) {
            return authenticationAction != null;
        }

        static final AuthenticationAction convertToJetpackResponse$lambda$16(AuthenticationAction authenticationAction) {
            x.c(authenticationAction);
            return authenticationAction;
        }

        static final AuthenticationAction convertToJetpackResponse$lambda$17(l lVar, Object obj) {
            return (AuthenticationAction) lVar.invoke(obj);
        }

        static final boolean convertToJetpackResponse$lambda$2(CredentialEntry credentialEntry) {
            return credentialEntry != null;
        }

        static final CredentialEntry convertToJetpackResponse$lambda$4(CredentialEntry credentialEntry) {
            x.c(credentialEntry);
            return credentialEntry;
        }

        static final CredentialEntry convertToJetpackResponse$lambda$5(l lVar, Object obj) {
            return (CredentialEntry) lVar.invoke(obj);
        }

        static final Action convertToJetpackResponse$lambda$6(android.service.credentials.Action action) {
            Action.Companion companion = Action.Companion;
            Slice slice = action.getSlice();
            x.e(slice, "getSlice(...)");
            return companion.fromSlice(slice);
        }

        static final Action convertToJetpackResponse$lambda$7(l lVar, Object obj) {
            return (Action) lVar.invoke(obj);
        }

        static final boolean convertToJetpackResponse$lambda$8(Action action) {
            return action != null;
        }

        private final void populateActionEntries(BeginGetCredentialResponse.Builder builder, List<Action> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                builder.addAction(new android.service.credentials.Action(Action.Companion.toSlice((Action) it.next())));
            }
        }

        private final void populateAuthenticationEntries(BeginGetCredentialResponse.Builder builder, List<AuthenticationAction> list) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                builder.addAuthenticationAction(new android.service.credentials.Action(AuthenticationAction.Companion.toSlice((AuthenticationAction) it.next())));
            }
        }

        private final void populateCredentialEntries(BeginGetCredentialResponse.Builder builder, List<? extends CredentialEntry> list) {
            for (CredentialEntry credentialEntry : list) {
                Slice slice$credentials = CredentialEntry.Companion.toSlice$credentials(credentialEntry);
                if (slice$credentials != null) {
                    builder.addCredentialEntry(new android.service.credentials.CredentialEntry(new BeginGetCredentialOption(credentialEntry.getBeginGetCredentialOption().getId(), credentialEntry.getType(), Bundle.EMPTY), slice$credentials));
                }
            }
        }

        private final void populateRemoteEntry(BeginGetCredentialResponse.Builder builder, RemoteEntry remoteEntry) {
            if (remoteEntry == null) {
                return;
            }
            builder.setRemoteCredentialEntry(new android.service.credentials.RemoteEntry(RemoteEntry.Companion.toSlice(remoteEntry)));
        }

        public final BeginGetCredentialRequest convertToFrameworkRequest(androidx.credentials.provider.BeginGetCredentialRequest beginGetCredentialRequest) {
            x.f(beginGetCredentialRequest, "request");
            BeginGetCredentialRequest.Builder builder = new BeginGetCredentialRequest.Builder();
            if (beginGetCredentialRequest.getCallingAppInfo() != null) {
                builder.setCallingAppInfo(new CallingAppInfo(beginGetCredentialRequest.getCallingAppInfo().getPackageName(), beginGetCredentialRequest.getCallingAppInfo().getSigningInfo(), beginGetCredentialRequest.getCallingAppInfo().getOrigin$credentials()));
            }
            Stream stream = Collection.EL.stream(beginGetCredentialRequest.getBeginGetCredentialOptions());
            final l lVar = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda18
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToFrameworkRequest$lambda$0((androidx.credentials.provider.BeginGetCredentialOption) obj);
                }
            };
            BeginGetCredentialRequest beginGetCredentialRequestBuild = builder.setBeginGetCredentialOptions((List) stream.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda19
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12410m(lVar.invoke(obj));
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList())).build();
            x.e(beginGetCredentialRequestBuild, "build(...)");
            return beginGetCredentialRequestBuild;
        }

        public final BeginGetCredentialResponse convertToFrameworkResponse(androidx.credentials.provider.BeginGetCredentialResponse beginGetCredentialResponse) {
            x.f(beginGetCredentialResponse, "response");
            BeginGetCredentialResponse.Builder builder = new BeginGetCredentialResponse.Builder();
            populateCredentialEntries(builder, beginGetCredentialResponse.getCredentialEntries());
            populateActionEntries(builder, beginGetCredentialResponse.getActions());
            populateAuthenticationEntries(builder, beginGetCredentialResponse.getAuthenticationActions());
            populateRemoteEntry(builder, beginGetCredentialResponse.getRemoteEntry());
            BeginGetCredentialResponse beginGetCredentialResponseBuild = builder.build();
            x.e(beginGetCredentialResponseBuild, "build(...)");
            return beginGetCredentialResponseBuild;
        }

        public final androidx.credentials.provider.BeginGetCredentialRequest convertToJetpackRequest$credentials(BeginGetCredentialRequest beginGetCredentialRequest) {
            androidx.credentials.provider.CallingAppInfo callingAppInfoCreate;
            x.f(beginGetCredentialRequest, "request");
            ArrayList arrayList = new ArrayList();
            List beginGetCredentialOptions = beginGetCredentialRequest.getBeginGetCredentialOptions();
            x.e(beginGetCredentialOptions, "getBeginGetCredentialOptions(...)");
            Iterator it = beginGetCredentialOptions.iterator();
            while (it.hasNext()) {
                BeginGetCredentialOption beginGetCredentialOptionM12410m = HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12410m(it.next());
                BeginGetCredentialOption.Companion companion = androidx.credentials.provider.BeginGetCredentialOption.Companion;
                String id = beginGetCredentialOptionM12410m.getId();
                x.e(id, "getId(...)");
                String type = beginGetCredentialOptionM12410m.getType();
                x.e(type, "getType(...)");
                Bundle candidateQueryData = beginGetCredentialOptionM12410m.getCandidateQueryData();
                x.e(candidateQueryData, "getCandidateQueryData(...)");
                arrayList.add(companion.createFrom$credentials(id, type, candidateQueryData));
            }
            CallingAppInfo callingAppInfo = beginGetCredentialRequest.getCallingAppInfo();
            if (callingAppInfo != null) {
                CallingAppInfo.Companion companion2 = androidx.credentials.provider.CallingAppInfo.Companion;
                String packageName = callingAppInfo.getPackageName();
                x.e(packageName, "getPackageName(...)");
                SigningInfo signingInfo = callingAppInfo.getSigningInfo();
                x.e(signingInfo, "getSigningInfo(...)");
                callingAppInfoCreate = companion2.create(packageName, signingInfo, callingAppInfo.getOrigin());
            } else {
                callingAppInfoCreate = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialRequest(arrayList, callingAppInfoCreate);
        }

        public final androidx.credentials.provider.BeginGetCredentialResponse convertToJetpackResponse(BeginGetCredentialResponse beginGetCredentialResponse) {
            RemoteEntry remoteEntryFromSlice;
            x.f(beginGetCredentialResponse, "response");
            Stream stream = Collection.EL.stream(beginGetCredentialResponse.getCredentialEntries());
            final l lVar = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$0(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12414m(obj));
                }
            };
            Stream map = stream.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda9
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$1(lVar, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final l lVar2 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda10
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$2((CredentialEntry) obj));
                }
            };
            Stream streamFilter = map.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda11
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) lVar2.invoke(obj)).booleanValue();
                }
            });
            final l lVar3 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda12
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    CredentialEntry credentialEntry = (CredentialEntry) obj;
                    BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$4(credentialEntry);
                    return credentialEntry;
                }
            };
            Object objCollect = streamFilter.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda13
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$5(lVar3, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            x.e(objCollect, "collect(...)");
            List list = (List) objCollect;
            Stream stream2 = Collection.EL.stream(beginGetCredentialResponse.getActions());
            final l lVar4 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda14
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$6(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12409m(obj));
                }
            };
            Stream map2 = stream2.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda15
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$7(lVar4, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final l lVar5 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda16
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$8((Action) obj));
                }
            };
            Stream streamFilter2 = map2.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda17
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) lVar5.invoke(obj)).booleanValue();
                }
            });
            final l lVar6 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    Action action = (Action) obj;
                    BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$10(action);
                    return action;
                }
            };
            Object objCollect2 = streamFilter2.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda2
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$11(lVar6, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            x.e(objCollect2, "collect(...)");
            List list2 = (List) objCollect2;
            Stream stream3 = Collection.EL.stream(beginGetCredentialResponse.getAuthenticationActions());
            final l lVar7 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$12(HttpEngineDataSource$$ExternalSyntheticApiModelOutline0.m12409m(obj));
                }
            };
            Stream map3 = stream3.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda4
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$13(lVar7, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final l lVar8 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda5
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$14((AuthenticationAction) obj));
                }
            };
            Stream streamFilter3 = map3.filter(new Predicate() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda6
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) lVar8.invoke(obj)).booleanValue();
                }
            });
            final l lVar9 = new l() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda7
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    AuthenticationAction authenticationAction = (AuthenticationAction) obj;
                    BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$16(authenticationAction);
                    return authenticationAction;
                }
            };
            Object objCollect3 = streamFilter3.map(new Function() { // from class: androidx.credentials.provider.utils.BeginGetCredentialUtil$Companion$$ExternalSyntheticLambda8
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$17(lVar9, obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            x.e(objCollect3, "collect(...)");
            List list3 = (List) objCollect3;
            android.service.credentials.RemoteEntry remoteCredentialEntry = beginGetCredentialResponse.getRemoteCredentialEntry();
            if (remoteCredentialEntry != null) {
                RemoteEntry.Companion companion = RemoteEntry.Companion;
                Slice slice = remoteCredentialEntry.getSlice();
                x.e(slice, "getSlice(...)");
                remoteEntryFromSlice = companion.fromSlice(slice);
            } else {
                remoteEntryFromSlice = null;
            }
            return new androidx.credentials.provider.BeginGetCredentialResponse(list, list2, list3, remoteEntryFromSlice);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
