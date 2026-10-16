.class public Lcom/google/firebase/firestore/FirestoreRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fst"


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

.method public static synthetic a(LC6/l;)Lm9/I;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/google/firebase/firestore/FirestoreRegistrar;->lambda$getComponents$0(LL8/c;)Lm9/I;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LL8/c;)Lm9/I;
    .locals 9

    .line 1
    new-instance v0, Lm9/I;

    .line 2
    .line 3
    const-class v1, Landroid/content/Context;

    .line 4
    .line 5
    invoke-interface {p0, v1}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    const-class v2, Ls8/g;

    .line 12
    .line 13
    invoke-interface {p0, v2}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ls8/g;

    .line 18
    .line 19
    const-class v3, LK8/a;

    .line 20
    .line 21
    invoke-interface {p0, v3}, LL8/c;->g(Ljava/lang/Class;)LL8/r;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-class v4, LE8/a;

    .line 26
    .line 27
    invoke-interface {p0, v4}, LL8/c;->g(Ljava/lang/Class;)LL8/r;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v5, Lv9/h;

    .line 32
    .line 33
    const-class v6, LY9/b;

    .line 34
    .line 35
    invoke-interface {p0, v6}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-class v7, Lx9/f;

    .line 40
    .line 41
    invoke-interface {p0, v7}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-class v8, Ls8/l;

    .line 46
    .line 47
    invoke-interface {p0, v8}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Ls8/l;

    .line 52
    .line 53
    invoke-direct {v5, v6, v7, p0}, Lv9/h;-><init>(LO9/b;LO9/b;Ls8/l;)V

    .line 54
    .line 55
    .line 56
    invoke-direct/range {v0 .. v5}, Lm9/I;-><init>(Landroid/content/Context;Ls8/g;LL8/r;LL8/r;Lv9/h;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 6
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
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const-class v2, Lm9/I;

    .line 4
    .line 5
    invoke-static {v2}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v3, "fire-fst"

    .line 10
    .line 11
    iput-object v3, v2, LL8/a;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const-class v4, Ls8/g;

    .line 14
    .line 15
    invoke-static {v4}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 20
    .line 21
    .line 22
    const-class v4, Landroid/content/Context;

    .line 23
    .line 24
    invoke-static {v4}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 29
    .line 30
    .line 31
    const-class v4, Lx9/f;

    .line 32
    .line 33
    invoke-static {v4}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 38
    .line 39
    .line 40
    const-class v4, LY9/b;

    .line 41
    .line 42
    invoke-static {v4}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 47
    .line 48
    .line 49
    const-class v4, LK8/a;

    .line 50
    .line 51
    invoke-static {v4}, LL8/l;->a(Ljava/lang/Class;)LL8/l;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 56
    .line 57
    .line 58
    const-class v4, LE8/a;

    .line 59
    .line 60
    invoke-static {v4}, LL8/l;->a(Ljava/lang/Class;)LL8/l;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 65
    .line 66
    .line 67
    new-instance v4, LL8/l;

    .line 68
    .line 69
    const-class v5, Ls8/l;

    .line 70
    .line 71
    invoke-direct {v4, v1, v1, v5}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v4}, LL8/a;->c(LL8/l;)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lm9/B;

    .line 78
    .line 79
    invoke-direct {v4, v0}, Lm9/B;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object v4, v2, LL8/a;->g:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {v2}, LL8/a;->d()LL8/b;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    const-string v4, "25.1.1"

    .line 89
    .line 90
    invoke-static {v3, v4}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const/4 v4, 0x2

    .line 95
    new-array v4, v4, [LL8/b;

    .line 96
    .line 97
    aput-object v2, v4, v1

    .line 98
    .line 99
    aput-object v3, v4, v0

    .line 100
    .line 101
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    return-object v0
.end method
