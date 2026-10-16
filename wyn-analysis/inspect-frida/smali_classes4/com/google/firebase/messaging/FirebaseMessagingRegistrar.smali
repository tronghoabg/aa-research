.class public Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# static fields
.field private static final LIBRARY_NAME:Ljava/lang/String; = "fire-fcm"


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

.method public static synthetic a(LL8/t;LC6/l;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->lambda$getComponents$0(LL8/t;LL8/c;)Lcom/google/firebase/messaging/FirebaseMessaging;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$getComponents$0(LL8/t;LL8/c;)Lcom/google/firebase/messaging/FirebaseMessaging;
    .locals 7

    .line 1
    new-instance v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 2
    .line 3
    const-class v1, Ls8/g;

    .line 4
    .line 5
    invoke-interface {p1, v1}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ls8/g;

    .line 10
    .line 11
    const-class v2, Ly9/a;

    .line 12
    .line 13
    invoke-interface {p1, v2}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    const-class v2, LY9/b;

    .line 20
    .line 21
    invoke-interface {p1, v2}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-class v3, Lx9/f;

    .line 26
    .line 27
    invoke-interface {p1, v3}, LL8/c;->c(Ljava/lang/Class;)LO9/b;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const-class v4, LP9/d;

    .line 32
    .line 33
    invoke-interface {p1, v4}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, LP9/d;

    .line 38
    .line 39
    invoke-interface {p1, p0}, LL8/c;->f(LL8/t;)LO9/b;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    const-class p0, Ll9/d;

    .line 44
    .line 45
    invoke-interface {p1, p0}, LL8/c;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    move-object v6, p0

    .line 50
    check-cast v6, Ll9/d;

    .line 51
    .line 52
    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/messaging/FirebaseMessaging;-><init>(Ls8/g;LO9/b;LO9/b;LP9/d;LO9/b;Ll9/d;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 57
    .line 58
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p0
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 7
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
    new-instance v2, LL8/t;

    .line 4
    .line 5
    const-class v3, Ld9/b;

    .line 6
    .line 7
    const-class v4, Lq5/g;

    .line 8
    .line 9
    invoke-direct {v2, v3, v4}, LL8/t;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    const-class v3, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 13
    .line 14
    invoke-static {v3}, LL8/b;->b(Ljava/lang/Class;)LL8/a;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v4, "fire-fcm"

    .line 19
    .line 20
    iput-object v4, v3, LL8/a;->a:Ljava/lang/Object;

    .line 21
    .line 22
    const-class v5, Ls8/g;

    .line 23
    .line 24
    invoke-static {v5}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 29
    .line 30
    .line 31
    new-instance v5, LL8/l;

    .line 32
    .line 33
    const-class v6, Ly9/a;

    .line 34
    .line 35
    invoke-direct {v5, v1, v1, v6}, LL8/l;-><init>(IILjava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 39
    .line 40
    .line 41
    const-class v5, LY9/b;

    .line 42
    .line 43
    invoke-static {v5}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 48
    .line 49
    .line 50
    const-class v5, Lx9/f;

    .line 51
    .line 52
    invoke-static {v5}, LL8/l;->b(Ljava/lang/Class;)LL8/l;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 57
    .line 58
    .line 59
    const-class v5, LP9/d;

    .line 60
    .line 61
    invoke-static {v5}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 66
    .line 67
    .line 68
    new-instance v5, LL8/l;

    .line 69
    .line 70
    invoke-direct {v5, v2, v1, v0}, LL8/l;-><init>(LL8/t;II)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 74
    .line 75
    .line 76
    const-class v5, Ll9/d;

    .line 77
    .line 78
    invoke-static {v5}, LL8/l;->d(Ljava/lang/Class;)LL8/l;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-virtual {v3, v5}, LL8/a;->c(LL8/l;)V

    .line 83
    .line 84
    .line 85
    new-instance v5, LW9/m;

    .line 86
    .line 87
    invoke-direct {v5, v2, v1}, LW9/m;-><init>(LL8/t;I)V

    .line 88
    .line 89
    .line 90
    iput-object v5, v3, LL8/a;->g:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-virtual {v3, v0}, LL8/a;->f(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, LL8/a;->d()LL8/b;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    const-string v3, "24.1.0"

    .line 100
    .line 101
    invoke-static {v4, v3}, Lic/d;->m(Ljava/lang/String;Ljava/lang/String;)LL8/b;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    const/4 v4, 0x2

    .line 106
    new-array v4, v4, [LL8/b;

    .line 107
    .line 108
    aput-object v2, v4, v1

    .line 109
    .line 110
    aput-object v3, v4, v0

    .line 111
    .line 112
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    return-object v0
.end method
