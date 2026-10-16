.class public final Lo0/e;
.super Llf/c;
.source "SourceFile"


# instance fields
.field public a:Lo0/f;

.field public b:J

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lo0/f;

.field public e:I


# direct methods
.method public constructor <init>(Lo0/f;Llf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo0/e;->d:Lo0/f;

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
    .locals 2

    .line 1
    iput-object p1, p0, Lo0/e;->c:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lo0/e;->e:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lo0/e;->e:I

    .line 9
    .line 10
    iget-object p1, p0, Lo0/e;->d:Lo0/f;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, Lo0/f;->f(JLlf/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
