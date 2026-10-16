.class public final LEf/X;
.super LEf/Z;
.source "SourceFile"


# instance fields
.field public final c:LEf/n;

.field public final synthetic d:LEf/b0;


# direct methods
.method public constructor <init>(LEf/b0;JLEf/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LEf/X;->d:LEf/b0;

    .line 2
    .line 3
    invoke-direct {p0, p2, p3}, LEf/Z;-><init>(J)V

    .line 4
    .line 5
    .line 6
    iput-object p4, p0, LEf/X;->c:LEf/n;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    sget-object v0, Lef/C;->a:Lef/C;

    .line 2
    .line 3
    iget-object v1, p0, LEf/X;->c:LEf/n;

    .line 4
    .line 5
    iget-object v2, p0, LEf/X;->d:LEf/b0;

    .line 6
    .line 7
    invoke-virtual {v1, v2, v0}, LEf/n;->C(LEf/A;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, LEf/Z;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LEf/X;->c:LEf/n;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
