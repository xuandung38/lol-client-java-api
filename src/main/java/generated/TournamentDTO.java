package generated;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TournamentDTO {

	public String bracketSize;
	public List<Integer> buyInOptions;
	public Integer entryFee;
	public Boolean honorRestriction;
	public Long id;
	public Boolean lastThemeOfSeason;
	public Integer maxSub;
	public String nameLocKey;
	public String nameLocKeySecondary;
	public List<TournamentPhaseDTO> phases;
	public Integer queueId;
	public Boolean rankRestriction;
	public List<ClashRewardConfigClient> rewardConfig;
	public Long rosterCreateDeadline;
	public Integer rosterSize;
	public Long scheduleEndTime;
	public Long scheduleTime;
	public Long scoutingTimeMs;
	public Boolean smsRestriction;
	public Integer themeId;
	public Boolean voiceEnabled;

}