.class public Lorg/apache/tika/utils/FileProcessResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field exitValue:I

.field isTimeout:Z

.field processTimeMillis:J

.field stderr:Ljava/lang/String;

.field stderrLength:J

.field stderrTruncated:Z

.field stdout:Ljava/lang/String;

.field stdoutLength:J

.field stdoutTruncated:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stderr:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stdout:Ljava/lang/String;

    .line 9
    .line 10
    const/4 v0, -0x1

    .line 11
    iput v0, p0, Lorg/apache/tika/utils/FileProcessResult;->exitValue:I

    .line 12
    .line 13
    const-wide/16 v0, -0x1

    .line 14
    .line 15
    iput-wide v0, p0, Lorg/apache/tika/utils/FileProcessResult;->processTimeMillis:J

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, p0, Lorg/apache/tika/utils/FileProcessResult;->isTimeout:Z

    .line 19
    .line 20
    iput-wide v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutLength:J

    .line 21
    .line 22
    iput-wide v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrLength:J

    .line 23
    .line 24
    iput-boolean v2, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrTruncated:Z

    .line 25
    .line 26
    iput-boolean v2, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutTruncated:Z

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public getExitValue()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/tika/utils/FileProcessResult;->exitValue:I

    .line 2
    .line 3
    return v0
.end method

.method public getProcessTimeMillis()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/utils/FileProcessResult;->processTimeMillis:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getStderr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stderr:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStderrLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getStdout()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stdout:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getStdoutLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutLength:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public isStderrTruncated()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrTruncated:Z

    .line 2
    .line 3
    return v0
.end method

.method public isStdoutTruncated()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutTruncated:Z

    .line 2
    .line 3
    return v0
.end method

.method public isTimeout()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/apache/tika/utils/FileProcessResult;->isTimeout:Z

    .line 2
    .line 3
    return v0
.end method

.method public setExitValue(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/apache/tika/utils/FileProcessResult;->exitValue:I

    .line 2
    .line 3
    return-void
.end method

.method public setProcessTimeMillis(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/utils/FileProcessResult;->processTimeMillis:J

    .line 2
    .line 3
    return-void
.end method

.method public setStderr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/utils/FileProcessResult;->stderr:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setStderrLength(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrLength:J

    .line 2
    .line 3
    return-void
.end method

.method public setStderrTruncated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrTruncated:Z

    .line 2
    .line 3
    return-void
.end method

.method public setStdout(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/apache/tika/utils/FileProcessResult;->stdout:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setStdoutLength(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutLength:J

    .line 2
    .line 3
    return-void
.end method

.method public setStdoutTruncated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutTruncated:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTimeout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/apache/tika/utils/FileProcessResult;->isTimeout:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    .line 1
    iget-object v0, p0, Lorg/apache/tika/utils/FileProcessResult;->stderr:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/tika/utils/FileProcessResult;->stdout:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lorg/apache/tika/utils/FileProcessResult;->exitValue:I

    .line 6
    .line 7
    iget-wide v3, p0, Lorg/apache/tika/utils/FileProcessResult;->processTimeMillis:J

    .line 8
    .line 9
    iget-boolean v5, p0, Lorg/apache/tika/utils/FileProcessResult;->isTimeout:Z

    .line 10
    .line 11
    iget-wide v6, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutLength:J

    .line 12
    .line 13
    iget-wide v8, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrLength:J

    .line 14
    .line 15
    iget-boolean v10, p0, Lorg/apache/tika/utils/FileProcessResult;->stderrTruncated:Z

    .line 16
    .line 17
    iget-boolean v11, p0, Lorg/apache/tika/utils/FileProcessResult;->stdoutTruncated:Z

    .line 18
    .line 19
    const-string v12, "FileProcessResult{stderr=\'"

    .line 20
    .line 21
    const-string v13, "\', stdout=\'"

    .line 22
    .line 23
    const-string v14, "\', exitValue="

    .line 24
    .line 25
    invoke-static {v12, v0, v13, v1, v14}, LA7/p0;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", processTimeMillis="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", isTimeout="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", stdoutLength="

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ", stderrLength="

    .line 57
    .line 58
    const-string v2, ", stderrTruncated="

    .line 59
    .line 60
    invoke-static {v0, v1, v8, v9, v2}, LVa/M6;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", stdoutTruncated="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, "}"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    return-object v0
.end method
