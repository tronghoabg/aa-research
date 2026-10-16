.class public final LF0/f;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:LW9/u;

.field public b:LGf/b;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:LW9/u;

.field public e:I


# direct methods
.method public constructor <init>(LW9/u;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF0/f;->d:LW9/u;

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
    iput-object p1, p0, LF0/f;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LF0/f;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LF0/f;->e:I

    .line 9
    .line 10
    iget-object p1, p0, LF0/f;->d:LW9/u;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, LW9/u;->k(Llf/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
