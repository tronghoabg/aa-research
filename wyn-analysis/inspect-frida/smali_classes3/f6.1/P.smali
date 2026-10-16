.class public final Lf6/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/y;


# instance fields
.field public final a:Lt6/k;

.field public final b:Lcom/unity3d/services/core/webview/b;

.field public final c:LY9/c;

.field public final d:Lae/d;

.field public final e:I


# direct methods
.method public constructor <init>(Lt6/k;LJ5/i;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/unity3d/services/core/webview/b;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p2, v1}, Lcom/unity3d/services/core/webview/b;-><init>(Ljava/lang/Object;I)V

    .line 5
    .line 6
    .line 7
    new-instance p2, LY9/c;

    .line 8
    .line 9
    const/16 v1, 0xd

    .line 10
    .line 11
    invoke-direct {p2, v1}, LY9/c;-><init>(I)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lae/d;

    .line 15
    .line 16
    const/16 v2, 0xd

    .line 17
    .line 18
    invoke-direct {v1, v2}, Lae/d;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lf6/P;->a:Lt6/k;

    .line 25
    .line 26
    iput-object v0, p0, Lf6/P;->b:Lcom/unity3d/services/core/webview/b;

    .line 27
    .line 28
    iput-object p2, p0, Lf6/P;->c:LY9/c;

    .line 29
    .line 30
    iput-object v1, p0, Lf6/P;->d:Lae/d;

    .line 31
    .line 32
    const/high16 p1, 0x100000

    .line 33
    .line 34
    iput p1, p0, Lf6/P;->e:I

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(LE5/d0;)Lf6/a;
    .locals 8

    .line 1
    iget-object v0, p1, LE5/d0;->b:LE5/a0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LE5/d0;->b:LE5/a0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v1, Lf6/Q;

    .line 12
    .line 13
    iget-object v3, p0, Lf6/P;->a:Lt6/k;

    .line 14
    .line 15
    iget-object v4, p0, Lf6/P;->b:Lcom/unity3d/services/core/webview/b;

    .line 16
    .line 17
    iget-object v0, p0, Lf6/P;->c:LY9/c;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, LE5/d0;->b:LE5/a0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, p1, LE5/d0;->b:LE5/a0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    sget-object v5, LI5/i;->K8:Lm9/S;

    .line 33
    .line 34
    iget-object v6, p0, Lf6/P;->d:Lae/d;

    .line 35
    .line 36
    iget v7, p0, Lf6/P;->e:I

    .line 37
    .line 38
    move-object v2, p1

    .line 39
    invoke-direct/range {v1 .. v7}, Lf6/Q;-><init>(LE5/d0;Lt6/k;Lcom/unity3d/services/core/webview/b;LI5/i;Lae/d;I)V

    .line 40
    .line 41
    .line 42
    return-object v1
.end method
