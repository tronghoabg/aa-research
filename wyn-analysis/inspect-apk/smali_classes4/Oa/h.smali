.class public final LOa/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOa/d;


# static fields
.field public static e:LOa/h;


# instance fields
.field public a:F

.field public final b:Lm9/S;

.field public c:LNa/a;

.field public d:LOa/c;


# direct methods
.method public constructor <init>(Lwa/a;Lm9/S;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput p1, p0, LOa/h;->a:F

    .line 6
    .line 7
    iput-object p2, p0, LOa/h;->b:Lm9/S;

    .line 8
    .line 9
    return-void
.end method

.method public static b()LOa/h;
    .locals 3

    .line 1
    sget-object v0, LOa/h;->e:LOa/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lm9/S;

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    invoke-direct {v0, v1}, Lm9/S;-><init>(I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lwa/a;

    .line 13
    .line 14
    const/16 v2, 0x17

    .line 15
    .line 16
    invoke-direct {v1, v2}, Lwa/a;-><init>(I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, LOa/h;

    .line 20
    .line 21
    invoke-direct {v2, v1, v0}, LOa/h;-><init>(Lwa/a;Lm9/S;)V

    .line 22
    .line 23
    .line 24
    sput-object v2, LOa/h;->e:LOa/h;

    .line 25
    .line 26
    :cond_0
    sget-object v0, LOa/h;->e:LOa/h;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LSa/a;->g:LSa/a;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, LSa/a;->b()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    sget-object p1, LSa/a;->g:LSa/a;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    sget-object p1, LSa/a;->i:Landroid/os/Handler;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    sget-object v0, LSa/a;->k:LA7/z;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    sput-object p1, LSa/a;->i:Landroid/os/Handler;

    .line 28
    .line 29
    :cond_1
    return-void
.end method
