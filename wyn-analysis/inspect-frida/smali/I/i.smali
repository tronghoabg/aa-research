.class public final LI/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/q0;


# instance fields
.field public final a:LVa/X7;

.field public final b:LI/h;

.field public final c:LZ/k;

.field public d:LZ/k;

.field public e:LZ/k;


# direct methods
.method public constructor <init>(LVa/X7;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI/i;->a:LVa/X7;

    .line 5
    .line 6
    new-instance v0, LI/h;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LI/h;-><init>(LI/i;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LI/i;->b:LI/h;

    .line 12
    .line 13
    sget-object v0, LZ/i;->a:LZ/i;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const v2, 0xffff

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Le0/z;->k(LZ/k;Le0/E;I)LZ/k;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, LI/f;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v2, p0, v3}, LI/f;-><init>(LI/i;I)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2}, Lka/e0;->m(LZ/k;Ltf/l;)LZ/k;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, LI/f;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, p0, v3}, LI/f;-><init>(LI/i;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, LU8/v0;->X(LZ/k;Ltf/l;)LZ/k;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iput-object v1, p0, LI/i;->c:LZ/k;

    .line 44
    .line 45
    iget-object p1, p1, LVa/X7;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LI/j;

    .line 48
    .line 49
    iget-object p1, p1, LI/j;->a:Lz0/b;

    .line 50
    .line 51
    new-instance v1, LA/W;

    .line 52
    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    invoke-direct {v1, v2, p1, p0}, LA/W;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    invoke-static {v0, p1, v1}, LFe/g;->J(LZ/k;ZLtf/l;)LZ/k;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, LI/i;->d:LZ/k;

    .line 64
    .line 65
    iput-object v0, p0, LI/i;->e:LZ/k;

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    .line 1
    return-void
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final k()V
    .locals 0

    .line 1
    return-void
.end method
