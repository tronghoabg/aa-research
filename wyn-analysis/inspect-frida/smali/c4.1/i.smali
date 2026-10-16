.class public final Lc4/i;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lc4/j;

.field public b:Lc4/h;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lc4/j;

.field public e:I


# direct methods
.method public constructor <init>(Lc4/j;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lc4/i;->d:Lc4/j;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Llf/c;-><init>(Ljf/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lc4/i;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lc4/i;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lc4/i;->e:I

    .line 9
    .line 10
    iget-object p1, p0, Lc4/i;->d:Lc4/j;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lc4/j;->b(Lh4/h;Llf/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
