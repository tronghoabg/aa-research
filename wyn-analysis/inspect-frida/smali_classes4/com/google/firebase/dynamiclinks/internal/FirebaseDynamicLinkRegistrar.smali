.class public final Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-dl"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(LC6/l;)Le9/a;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/dynamiclinks/internal/FirebaseDynamicLinkRegistrar;->lambda$getComponents$0(LL8/c;)Le9/a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LL8/c;)Le9/a;
    .locals 3

    .line 1
    new-instance v0, Lf9/h;

    .line 2
    .line 3
    const-class v1, Ls8/g;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls8/g;

    .line 10
    .line 11
    const-class v2, Lw8/d;

    .line 12
    .line 13
    invoke-interface {p0, v2}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-direct {v0, v1, p0}, Lf9/h;-><init>(Ls8/g;LO9/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LL8/b;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Le9/a;

    .line 2
    .line 3
    invoke-static {v0}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "fire-dl"

    .line 8
    .line 9
    iput-object v1, v0, LL8/a;->a:Ljava/lang/Object;

    .line 10
    .line 11
    const-class v2, Ls8/g;

    .line 12
    .line 13
    invoke-static {v2}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v2}, LL8/a;->c(LL8/l;)V

    .line 18
    .line 19
    .line 20
    const-class v2, Lw8/d;

    .line 21
    .line 22
    invoke-static {v2}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, v2}, LL8/a;->c(LL8/l;)V

    .line 27
    .line 28
    .line 29
    new-instance v2, Lcom/applovin/impl/Z0;

    .line 30
    .line 31
    const/16 v3, 0x15

    .line 32
    .line 33
    invoke-direct {v2, v3}, Lcom/applovin/impl/Z0;-><init>(I)V

    .line 34
    .line 35
    .line 36
    iput-object v2, v0, LL8/a;->g:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {v0}, LL8/a;->d()LL8/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v2, "22.1.0"

    .line 43
    .line 44
    invoke-static {v1, v2}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/4 v2, 0x2

    .line 49
    new-array v2, v2, [LL8/b;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    aput-object v0, v2, v3

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v1, v2, v0

    .line 56
    .line 57
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0
.end method
