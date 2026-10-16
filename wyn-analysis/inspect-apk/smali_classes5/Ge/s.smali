.class public final LGe/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QEntitlementsUpdateListener;


# instance fields
.field public final synthetic a:LGe/t;


# direct methods
.method public constructor <init>(LGe/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGe/s;->a:LGe/t;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onEntitlementsUpdated(Ljava/util/Map;)V
    .locals 1

    .line 1
    const-string v0, "entitlements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LGe/s;->a:LGe/t;

    .line 7
    .line 8
    invoke-static {p1}, LGe/c;->a(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, v0, LGe/t;->c:LGe/i;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LGe/i;->onEntitlementsUpdated(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
